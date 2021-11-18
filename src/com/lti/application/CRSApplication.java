package com.lti.application;

import java.util.Scanner;

import com.lti.bean.Course;
import com.lti.bean.Professor;
import com.lti.bean.Student;
import com.lti.exception.EntityNotFoundException;
import com.lti.service.AdminOperations;
import com.lti.service.UserOperations;

public class CRSApplication {

	/**
	 * @param args
	 */

	public static void display() {
		System.out.println("Welcome To Registration Portal ..!!");
		System.out.println("1. Student Registration \n" + "2. Login\n" + "3. Forget Password\n" + "4. Exit");
		System.out.println("Please enter your choice...!");
	}

	public static void main(String[] args) throws EntityNotFoundException {
		// TODO Auto-generated method stub

		AdminOperations admin=new AdminOperations();
		
		//admin.addCourse();
		display();

		// String inp= String.valueOf(input);

		boolean exit=false;
		do {
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			
		
		switch (input) {
		case 1:
			StudentCrsMenu sCrs = new StudentCrsMenu();
			Student std = new Student();

			System.out.println("Enter Your Roll Number");
			int sRollNo = sc.nextInt();

			System.out.println("Enter Your Name");
			String sName = sc.next();

			System.out.println("Enter Your EmailID");
			String sEmailId = sc.next();

			std.setAprovalStatus(false);
			std.setsRollNo(sRollNo);
			std.setsName(sName);
			std.setsEmailId(sEmailId);
			sCrs.registration(std);
			System.out.println("HI");
			break;
			

		case 2:
			UserOperations userOperations = new UserOperations();

			System.out.println();
			System.out.println("Enter your USERID");
			String userId = sc.next();

			System.out.println("Enter your Password");
			String password = sc.next();
			
			System.out.println("Enter your role.. Student or Professor or Admin?");
			String roleInput = sc.next();
			
			String role=roleInput.toLowerCase();
			
			if(role.equals("admin") )
			{
				userOperations.adminLogin(userId, password);
			}
			else if (role.equals("professor")) {
				userOperations.loginAsProfessor(userId, password);
			}
			else if(role.equals("student") ) {
				userOperations.loginAsStudent(userId, password);
			}

			else
				System.out.println("Not Valid Role");
			
			break;

		case 4:
			
			System.out.println("Exited Successfully from Application");
			exit=true;
			
			break;
		default:

			System.out.println("You have entered wrong choise.. Please select any one of these..!!");
			display();
		}

	}
		while (!exit);

	}}
