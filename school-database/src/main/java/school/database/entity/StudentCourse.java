package school.database.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class StudentCourse {
	
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "studentId")
	private Integer studentId;
	
	@Column(name = "courseId")
	private Integer courseId;
	
	@Column(name = "progress")
	private Double progress;
	
	@Column(name = "startDate")
	private Date startDate;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "courseId", nullable = false)
	private Course course;

}
