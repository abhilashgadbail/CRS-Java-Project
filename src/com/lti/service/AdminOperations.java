package com.lti.service;

import java.util.ArrayList;
import java.util.List;

import com.lti.bean.Course;
import com.lti.bean.Payment;
import com.lti.bean.Professor;
import com.lti.bean.Student;
import com.lti.dao.AdminDAOOperations;
import com.lti.util.Utility;

public class AdminOperations implements AdminInterface {

	AdminDAOOperations adminDAOOperations=new AdminDAOOperations();
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lti.service.AdminInterface#adminLogin()
	 */
	static List<Course> courseList = new ArrayList<Course>();
	static List<Professor> profList = new ArrayList<Professor>();

	static List<Payment> payList = new ArrayList<Payment>();

	public void adminLogin() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lti.service.AdminInterface#addCourse()
	 */
	public void addCourse() {

		adminDAOOperations.addToCourse();
		
		/*courseList.add(new Course(101, "ENTC", 8, 50000.00, 4));
		courseList.add(new Course(102, "CTIT", 8, 50000.00, 4));
		courseList.add(new Course(103, "Mechanical", 8, 50000.00, 4));*/

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lti.service.AdminInterface#removeCourse()
	 */
	public void removeCourse(int id) {
		/*
		 * courseList.remove(id);
		 * System.out.println("Course has been removed Succesfully!!!"+ id);
		 */
		List<Course> courseList1 = new ArrayList<Course>();
		for (Course c : courseList) {
			if (c.getcId() == id) {
				System.out.println("jhdiahdash======");
				courseList1.add(c);
				// System.out.println("Professor has been removed Succesfully!!!"+ c.getpId());
			}

		}
		if (courseList1.size() > 0) {
			courseList.remove(courseList1.get(0));
			System.out.println("Course has been removed Succesfully!!!" + id);
		} else {
			System.out.println("No Course Found with this id" + id);

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lti.service.AdminInterface#addProfessor()
	 */
	public void addProfessor() {
		profList.add(new Professor(111, "ABC", 101, 1111, "XYZ", "abc@gmail.com"));
		profList.add(new Professor(112, "MNP", 102, 1111, "XYZ", "mnp@gmail.com"));
		profList.add(new Professor(113, "EFG", 103, 1111, "XYZ", "efg@gmail.com"));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lti.service.AdminInterface#removeProfessor()
	 */
	public void removeProfessor(int pid) {
		List<Professor> profList1 = new ArrayList<Professor>();
		for (Professor c : profList) {
			if (c.getpId() == pid) {
				System.out.println("jhdiahdash======");
				profList1.add(c);
				// System.out.println("Professor has been removed Succesfully!!!"+ c.getpId());
			}

		}
		if (profList1.size() > 0) {
			profList.remove(profList1.get(0));
			System.out.println("Professor has been removed Succesfully!!!" + pid);
		} else {
			System.out.println("No Professor Found with this id" + pid);

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lti.service.AdminInterface#viewCourse()
	 */
	public void viewCourse() {
		for (Course value : courseList) {

			System.out.println("Element: " + value.toString());
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lti.service.AdminInterface#updateCourse()
	 */
	public void updateCourse(Course obj) {
		for (Course value : courseList) {
			if (value.getcId() == obj.getcId()) {
				value.setcFees(obj.getcFees());
				value.setcDuration(obj.getcDuration());
				value.setcName(obj.getcName());
				value.setcSemester(obj.getcSemester());

			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lti.service.AdminInterface#updateProfessorDetails()
	 */
	public void viewProfessorDetails() {
		for (Professor c : profList) {

			System.out.println("Element: " + c.toString());
		}
	}

	public void updateProfessorDetails(Professor obj) {
		for (Professor value : profList) {
			if (value.getpId() == obj.getpId()) {
				value.setpName(obj.getpName());
				value.setpEmailId(obj.getpEmailId());
				value.setpCourseId(obj.getpCourseId());
				value.setpDeptId(obj.getpDeptId());
				value.setpDeptName(obj.getpDeptName());
			}
		}
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lti.service.AdminInterface#removeStudentDetails()
	 */
	/*
	 * public void removeStudentDetails(){
	 * 
	 * }
	 */

	public void approveStudentRegistration(int id) {

		payList.add(new Payment(1, 12345, 25000, true));
		payList.add(new Payment(2, 96545, 45000, true));
		payList.add(new Payment(4, 98545, 35000, false));

		for (Payment payment : payList) {
			if (payment.getsId() == id && payment.isStatus()) {
				System.out.println("Student registration approval done  successfully");
			}
		}

	}
	
	public void generateReportCard(float cpi) {
		String grade=Utility.calculateCPI(cpi);
		
		System.out.println(grade);
		
		if(grade.equals("E")) {
			System.out.println("Student has Failed..!!");
		}
		else
			System.out.println("Student has Passed..!!");
		
		
	}
	
}
