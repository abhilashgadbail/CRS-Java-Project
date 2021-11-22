package com.lti.service;

import com.lti.bean.Student;
import com.lti.exception.EntityNotFoundException;

import java.sql.SQLException;

public interface StudentInterface {

	void register(String sName, String sCourseName, int deptId, String dptName, int sem, String emailid, String password) throws SQLException, EntityNotFoundException;

	void changePassword(int id, String oPswd, String nPswd);

	void viewCourses();

	void viewGrades();

	public void dropCourse();
	
	void studentRegistration(Student std);
	
	void payFees();
	
	void viewRegeisteredCourses();

	void addPayment(int rollNo, int amount);
}