package school.database.dao;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import school.database.entity.Course;


public class CourseDAOTest {
	
	private static CourseDAO courseDAO;
	
	@BeforeAll
	public static void setUp() {
		courseDAO = new CourseDAO();
	}
	
	@Test
	public void testGetCourseById() {
		// given
		Course expected = new Course();
		
		expected.setId(1);
		expected.setName("Accounting & Finance");
		expected.setDeptId(2);
		
		// when 
		Course actual = courseDAO.findById(1);
		
		// then
		Assertions.assertEquals(expected, actual);
		Assertions.assertEquals(expected.getName(), actual.getName());
		Assertions.assertEquals(expected.getDeptId(), actual.getDeptId());
	}

	@Test
	public void testGetCourseByName() {
		// given
		Course expected = new Course();
		
		expected.setId(1);
		expected.setName("Accounting & Finance");
		expected.setDeptId(2);
		
		// when 
		List<Course> actualList = courseDAO.findByCourseName(expected.getName());
		
		// then
		Assertions.assertTrue(actualList.size() > 0);
		
		Course actual = actualList.get(0);
		Assertions.assertEquals(expected, actual);
		Assertions.assertEquals(expected.getName(), actual.getName());
		Assertions.assertEquals(expected.getDeptId(), actual.getDeptId());
	}
	
	@Test
	public void testGetCourseStartsWithName() {
		// given
		Course expected1 = new Course();
		
		expected1.setId(41);
		expected1.setName("History");
		expected1.setDeptId(3);
		
		Course expected2 = new Course();
		
		expected2.setId(42);
		expected2.setName("History of Art, Architecture & Design");
		expected2.setDeptId(1);
		
		// when 
		List<Course> actualList = courseDAO.findByCourseNameStartsWith("History");
		
		// then
		Assertions.assertTrue(actualList.size() == 2);
		
		Course actual1 = actualList.get(0);
		Assertions.assertEquals(expected1, actual1);
		Assertions.assertEquals(expected1.getName(), actual1.getName());
		Assertions.assertEquals(expected1.getDeptId(), actual1.getDeptId());

		Course actual2 = actualList.get(1);
		Assertions.assertEquals(expected2, actual2);
		Assertions.assertEquals(expected2.getName(), actual2.getName());
		Assertions.assertEquals(expected2.getDeptId(), actual2.getDeptId());
	}

}
