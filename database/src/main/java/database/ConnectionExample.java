package database;

import java.sql.Connection;

import java.util.List;

public class ConnectionExample {

	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAO();

		List<Employee> employees = employeeDAO.findByFirstName("Mary", "Patterson");

		for (Employee e : employees) {
			System.out.println(e.getFirstName() + " " + e.getLastName());
		}
		
		List<Employee> employee2 = employeeDAO.findByEmail("mpatterson@classicmodelcars.com");
		
		for (Employee e : employees2) {
			System.out.println(e.getEmail());
		}
	}
}
