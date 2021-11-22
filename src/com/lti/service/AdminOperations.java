package com.lti.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lti.SQLconstant.CombineQuery;
import com.lti.bean.Course;
import com.lti.bean.Payment;
import com.lti.bean.Professor;
import com.lti.bean.Student;
import com.lti.dao.AdminDAOOperations;
import com.lti.exception.EntityNotFoundException;
import com.lti.util.DBUtils;
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
	public void addCourse(String cName,int semester,double fees,int duration) {

		adminDAOOperations.addToCourse(cName,semester,fees,duration);
		


	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lti.service.AdminInterface#removeCourse()
	 */
	public void removeCourse(int id) throws SQLException, EntityNotFoundException {

		Connection conn = null;
		PreparedStatement stmt = null;
		conn =DBUtils.getConnection();
		stmt = conn.prepareStatement(CombineQuery.removeCourseSql);
		stmt.setInt(1,id);
		int resultSet = stmt.executeUpdate();

		if (resultSet !=0 ) {
			System.out.println("Course Successfully deleted");
		}
		else
			throw new EntityNotFoundException("there is no course wth this id "+id+" found");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lti.service.AdminInterface#addProfessor()
	 */
	public void addProfessor(int pId, String pName, int pCourseId, int pDeptId, String pDeptName, String pEmailId) {
		adminDAOOperations.addProfessorDetails(pId,pName,pCourseId,pDeptId,pDeptName,pEmailId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lti.service.AdminInterface#removeProfessor()
	 */
	public void removeProfessor(int pid) throws SQLException, EntityNotFoundException {
		
		
		
		adminDAOOperations.removeProf(pid);
		
		
		
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

	/*public void approveStudentRegistration(int id) {

		payList.add(new Payment(1, 12345, 25000, true));
		payList.add(new Payment(2, 96545, 45000, true));
		payList.add(new Payment(4, 98545, 35000, false));

		for (Payment payment : payList) {
			if (payment.getsId() == id && payment.isStatus()) {
				System.out.println("Student registration approval done  successfully");
			}
		}

	}*/
	
	public void generateReportCard(float cpi) {
		String grade=Utility.calculateCPI(cpi);
		
		System.out.println(grade);
		
		if(grade.equals("E")) {
			System.out.println("Student has Failed..!!");
		}
		else
			System.out.println("Student has Passed..!!");
		
		
	}
	
	public void approveStudentRegistration(int sId){
		try {
			adminDAOOperations.approveStudentRegistration(sId);
		} catch (EntityNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
