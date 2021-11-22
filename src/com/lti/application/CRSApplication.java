package com.lti.application;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

import com.lti.bean.Course;
import com.lti.bean.Professor;
import com.lti.bean.Student;
import com.lti.exception.EntityNotFoundException;
import com.lti.exception.StatusNotApprovedException;
import com.lti.exception.TransectionFailedException;
import com.lti.service.AdminOperations;
import com.lti.service.StudentInterface;
import com.lti.service.StudentOperations;
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

	static StudentInterface std = new StudentOperations();

	public static void main(String[] args) throws EntityNotFoundException, SQLException, ParseException, StatusNotApprovedException, TransectionFailedException {
		// TODO Auto-generated method stub

		AdminOperations admin = new AdminOperations();

		// admin.addCourse();
		display();

		// String inp= String.valueOf(input);

		boolean exit = false;
		do {
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();

			switch (input) {
			case 1:

				System.out.println("Enter your Name");
				String sName = sc.next();

				System.out.println("Enter your Course Name");
				String sCourseName = sc.next();

				System.out.println("Enter your DeptId");
				int deptId = sc.nextInt();

				System.out.println("Enter your Dept Name");
				String dptName = sc.next();

				System.out.println("Enter your Sem");
				int sem = sc.nextInt();

				System.out.println("Enter your emailId");
				String email = sc.next();

				System.out.println("Enter your password");
				String password1 = sc.next();

				std.register(sName, sCourseName, deptId, dptName, sem, email, password1);

				break;

			case 2:
				UserOperations userOperations = new UserOperations();

				System.out.println();
				System.out.println("Enter your USERID");
				String userId = sc.next();

				System.out.println("Enter your Password");
				String password = sc.next();

				userOperations.login(userId, password);

				break;

			case 4:

				System.out.println("Exited Successfully from Application");
				exit = true;

				break;
			default:

				System.out.println("You have entered wrong choise.. Please select any one of these..!!");
				display();
			}

		} while (!exit);

	}
}
