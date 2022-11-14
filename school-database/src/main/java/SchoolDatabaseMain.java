import java.util.List;

import school.database.dao.CourseDAO;
import school.database.dao.DepartmentDAO;
import school.database.entity.Course;
import school.database.entity.Department;

public class SchoolDatabaseMain {

	public static void main(String[] args) {

		CourseDAO courseDao = new CourseDAO();

		Course c = courseDao.findById(28);
		System.out.println(c);

		List<Course> courses = courseDao.findByCourseName("English");
		for (Course course : courses) {
			System.out.println(course);
		}

		// ------------------------------ inserting a course

		DepartmentDAO departmentDao = new DepartmentDAO();
		Department art = departmentDao.findById(1);

		Course newCourse = new Course();

		// we should not have to set an id because it should always be an autoincrmeent
		// every time you run the code you will have to manually change this id
		newCourse.setId(100);
		newCourse.setName("new course name");
		newCourse.setDepartment(art);

		// insert into course ( id , name, deptId ) values ( 101, "by sql", (select id
		// from department d where d.id = 1 ));
		courseDao.insert(newCourse);

		// https://attacomsian.com/blog/spring-data-jpa-one-to-many-mapping
		// 1) implement a find by name on the deptarmentdao
		// 2) implement a findByNameStartsWith on the course dao .. using a HQL like
		// 3) create entity for student table
		// 4) create a dao for student with findById
		// 5) use mysql workbench to add a id column that is a PK , not null , auto
		// increment to the studentcourse table
		// 5) create an entity for studentcourse table
		// 6) create a one to many relationship between student course and student
		// 7) create a one to many relationship between student course and course

		// bonus -- try to register a student for a course

	}

}