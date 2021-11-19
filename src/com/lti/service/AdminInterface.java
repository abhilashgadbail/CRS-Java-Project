package com.lti.service;

import java.util.Date;

import com.lti.bean.Course;
import com.lti.bean.Professor;

public interface AdminInterface {

	public void adminLogin();

	public void addCourse(int courseId,String cName,int semester,double fees,int duration);

	public void removeCourse(int id);

	public void addProfessor(int pId, String pName, int pCourseId, int pDeptId, String pDeptName, String pEmailId);

	public void removeProfessor(int id);

	public void viewCourse();

	public void updateCourse(Course course);

	public void updateProfessorDetails(Professor prof);

	public void approveStudentRegistration(int id);

}