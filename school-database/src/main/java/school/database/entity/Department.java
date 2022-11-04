package school.database.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode
@Table(name = "department")
public class Department {

	@Id
	@Column(name = "id")
	@EqualsAndHashCode.Include
	private Integer id;

	@Column(name = "name")
	@EqualsAndHashCode.Exclude
	private String name;
	
	// mapped by department because ... deparment is the name of the java variable in the Course entity
	@OneToMany(mappedBy = "department", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Course> courses;
	
	// mapped by department because ... deparment is the name of the java variable in the Course entity
		@OneToMany(mappedBy = "department", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		private List<Student> Student;

}