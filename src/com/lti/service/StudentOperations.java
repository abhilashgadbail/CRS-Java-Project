package com.lti.service;

import java.util.ArrayList;
import java.util.List;

import com.lti.bean.Student;
import com.lti.dao.StudentDAOOperations;
import com.lti.exception.BadRequestException;

public class StudentOperations implements StudentInterface {
	// static List<Student> studentList= new ArrayList<Student>();
	Student s = new Student();
	StudentDAOOperations sDAO = new StudentDAOOperations();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lti.service.StudentInterface#register(java.lang.String,
	 * java.lang.String, int, java.lang.String, int)
	 */
	@Override
	public void register(String sName, String sCourseName, int deptId, String dptName, int sem) {
		sDAO.registerStudent(sName, sCourseName, deptId, dptName, sem);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lti.service.StudentInterface#changePassword(int, java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void changePassword(int id, String oPswd, String nPswd)

	{
		// sDAO.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lti.service.StudentInterface#viewCourses()
	 */
	@Override
	public void viewCourses() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lti.service.StudentInterface#viewGrades()
	 */
	@Override
	public void viewGrades() {

	}

	/*
	 * public void dropCourse() {
	 *
	 * }
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.lti.service.StudentInterface#studentRegistration(com.lti.bean.Student)
	 */
	@Override
	public void studentRegistration(Student std) {

		try {

			System.out.println("Student is successfully registered...!!!");
			System.out.println(std.toString());
		} catch (BadRequestException ex) {
			ex.getMessage();
			ex.printStackTrace();
		}

	}

	@Override
	public void dropCourse() {
		// TODO Auto-generated method stub

		
	}

	@Override
	public void payFees() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewRegeisteredCourses() {
		// TODO Auto-generated method stub

	}

}
