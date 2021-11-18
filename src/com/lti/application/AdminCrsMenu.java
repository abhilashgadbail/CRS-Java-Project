/**
 * 
 */
package com.lti.application;

import com.lti.bean.Course;
import com.lti.bean.Professor;
import com.lti.service.AdminOperations;

/**
 * @author Hp
 *
 */
public class AdminCrsMenu {

	AdminOperations admin=new AdminOperations();
	
	public static void Admindisplay() {
		System.out.println("Welcome Admin ..!!");
		System.out.println("1. Add Course \n" + "2. Remove Course\n" + "3. Add Professor\n"
		+"4. Remove Professor\n" + "5. Approve Student Registration\n"
				+ "6. Exit");
		System.out.println("Please enter your choice...!");
		
	}
	
	public void adminCrsmethod() {
		
		admin.addCourse();
		admin.viewCourse();
		admin.removeCourse(103);
		admin.updateCourse(new Course(101,"EBC",8,60000.008,4));
		admin.viewCourse();
		admin.addProfessor();
		admin.viewProfessorDetails();
		admin.removeProfessor(113);
		admin.updateProfessorDetails(new Professor(112,"MNP",103,1111,"XYZ","mnp@yahoo.com"));
		admin.viewProfessorDetails();
		admin.approveStudentRegistration(1);
		
		admin.generateReportCard(5);
	}
		
}
