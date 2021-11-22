/**
 * 
 */
package com.lti.application;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.lti.bean.Course;
import com.lti.bean.Professor;
import com.lti.bean.Student;
import com.lti.exception.EntityNotFoundException;
import com.lti.service.AdminOperations;
import com.lti.service.UserOperations;

/**
 * @author Hp
 *
 */
public class AdminCrsMenu {

	AdminOperations admin = new AdminOperations();

	public void Admindisplay() throws ParseException, SQLException, EntityNotFoundException {
		System.out.println("Welcome Admin ..!!");
		System.out.println("1. Add Course \n" + "2. Remove Course\n" + "3. Add Professor\n"
				+ "4. Assign Professor\n" + "5. Remove Professor\n"
				+ "6. Approve Student Registration\n" + "6. Exit");
		System.out.println("Please enter your choice...!");

		boolean exit = false;
		do {
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();

			switch (input) {
			case 1:

				System.out.println("Enter your Course ID");
				int courseId = sc.nextInt();

				System.out.println("Enter your Course Name");
				String cName = sc.next();

				System.out.println("Enter your Semester");
				int semester = sc.nextInt();

				System.out.println("Enter your Course Fees");
				double fees = sc.nextDouble();

				System.out.println("Enter your Course Duration");
				int duration = sc.nextInt();

				admin.addCourse(courseId, cName, semester, fees, duration);

			case 2:

			case 3:
				System.out.println("Enter Professor ID");
				int pId = sc.nextInt();

				System.out.println("Enter Professor  Name");
				String pName = sc.next();

				System.out.println("Enter Professor Course ID");
				int pCourseId = sc.nextInt();

				System.out.println("Enter Professor's Department ID");
				int pDeptId = sc.nextInt();

				System.out.println("Enter Professor's Department Name");
				String pDeptName = sc.next();

				System.out.println("Enter Professor's Email ID");
				String pEmailId = sc.next();

				admin.addProfessor(pId, pName, pCourseId, pDeptId, pDeptName, pEmailId);
			case 4:

				break;
				
			case 5:

				System.out.println("Enter Professor's ID");
				int profId = sc.nextInt();
				
				admin.removeProfessor(profId);
				break;
				
			case 6:
				System.out.println("Enter StudentId");
				int sId = sc.nextInt();
				admin.approveStudentRegistration(sId);
				break;
				
			default:

				Admindisplay();
			}

		} while (!exit);

	}

	public void adminCrsmethod() {

		// admin.addCourse();
		admin.viewCourse();
		//admin.removeCourse(103);
		admin.updateCourse(new Course(101, "EBC", 8, 60000.008, 4));
		admin.viewCourse();
		//admin.addProfessor();
		admin.viewProfessorDetails();
		//admin.removeProfessor(113);
		// admin.updateProfessorDetails(new
		// Professor(112,"MNP",103,1111,"XYZ","mnp@yahoo.com"));
		admin.viewProfessorDetails();
		admin.approveStudentRegistration(1);

		admin.generateReportCard(5);
	}

}
