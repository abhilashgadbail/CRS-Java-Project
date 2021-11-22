/**
 * 
 */
package com.lti.application;

import java.util.Scanner;

import com.lti.bean.Student;
import com.lti.service.StudentInterface;
import com.lti.service.StudentOperations;

/**
 * @author Hp
 *
 */
public class StudentCrsMenu {
	static StudentInterface std = new StudentOperations();

	public static void studentDisplay() {
		System.out.println("Welcome Student ..!!");
		System.out.println("1. Register \n" + "2. Change Password\n" + "3. View GradeCard" + "4.Exit");
		System.out.println("Please enter your choice...!");

		boolean exit = false;
		do {
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();

			switch (input) {
			case 1:
				/*
				 * private int sRollNo; private String sName; private String sGrade; private
				 * String sCourseId; private String sDeptId; private String sDeptName; private
				 * String sEmailId; private String sUserName; private String sPassWord; private
				 * boolean aprovalStatus;
				 */

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

				std.register(sName, sCourseName, deptId, dptName, sem);

				// admin.addCourse(courseId,cName,semester,fees,duration);

			case 2:

				System.out.println("Enter your UserID");
				int id = sc.nextInt();
				System.out.println("Enter your old password");
				String oPswd = sc.next();
				System.out.println("Enter your new password");
				String nPswd = sc.next();
				std.changePassword(id, oPswd, nPswd);

				break;

			case 3:

				std.viewGrades();

				break;

			case 4:

				System.out.println("Exited Successfully from Application");
				exit = true;
				break;

			default:

				studentDisplay();
			}

		} while (!exit);
	}

	public void registration(Student std1) {
		std.studentRegistration(std1);
	}
}
