package com.test.project.HibernateJPABeginner;

import com.test.hib.controller.findUser_Hql;
import com.perscholas.controller.EmployeeController;
/**
 * Hello world!
 *
 */
public class App 
{ 
	public static void main( String[] args )
    {
		 System.out.println( "Hello World!" );
	        EmployeeController e = new EmployeeController();
	        e.createEmployeeTable();
		//findUser_Hql u = new findUser_Hql();
      //u.findUser();
      //u.findUserSelect();
      //u.getRecordbyId();
      //u.getmaxSalary();
    }
}
