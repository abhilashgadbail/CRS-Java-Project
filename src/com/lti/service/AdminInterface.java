package com.lti.service;

import com.lti.bean.Course;
import com.lti.bean.Professor;
import com.lti.exception.EntityNotFoundException;

import java.sql.SQLException;

public interface AdminInterface {

	public void adminLogin();

	public void addCourse(int courseId,String cName,int semester,double fees,int duration);

	public void removeCourse(int id) throws SQLException, EntityNotFoundException;

	public void addProfessor();

	public void removeProfessor(int id);

	public void viewCourse();

	public void updateCourse(Course course);

	public void updateProfessorDetails(Professor prof);

	public void approveStudentRegistration(int id);

}