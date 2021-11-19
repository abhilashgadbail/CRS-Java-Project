/**
 * 
 */
package com.lti.application;

import com.lti.bean.Student;
import com.lti.service.StudentOperations;

/**
 * @author Hp
 *
 */
public class StudentCrsMenu {

	StudentOperations std=new StudentOperations();
	
	public static void studentDisplay() {
		System.out.println("Welcome Student ..!!");
		System.out.println("1. View GradeCard \n" +  "2. Student Registration\n"
				+ "3. Exit");
		System.out.println("Please enter your choice...!");
		
	}
	
	public void registration(Student std1) {
		std.studentRegistration(std1);
	}
}
