package com.lti.service;

import com.lti.bean.Course;
import com.lti.bean.Professor;

public interface AdminInterface {

	public void adminLogin();

	public void addCourse(int courseId,String cName,int semester,double fees,int duration);

	public void removeCourse(int id);

	public void addProfessor();

	public void removeProfessor(int id);

	public void viewCourse();

	public void updateCourse(Course course);

	public void updateProfessorDetails(Professor prof);

	public void approveStudentRegistration(int id);

}