package com.lti.service;

import com.lti.bean.Student;

public interface StudentInterface {

	void register(String sName, String sCourseName, int deptId, String dptName, int sem);

	void changePassword(int id, String oPswd, String nPswd);

	void viewCourses();

	void viewGrades();

	public void dropCourse();
	
	void studentRegistration(Student std);
	
	void payFees();
	
	void viewRegeisteredCourses();

}