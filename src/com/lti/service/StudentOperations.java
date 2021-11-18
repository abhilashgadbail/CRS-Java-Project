package com.lti.service;

import java.util.ArrayList;
import java.util.List;

import com.lti.bean.Student;
import com.lti.exception.BadRequestException;

public class StudentOperations {
	
//	PLogin
//	   ViewStudentDetails
//	   UpdateGrade
//	   ViewCourses
	
	static List<Student> studentList= new ArrayList<Student>();	
	Student s=new Student();
	
	
	public void viewStudentDetails()
	{
		
	}
	public void addCourse()
	{
		
	}
	public void dropCourse()
	{
		
	}
	public void viewCourses()
	{
		
	}
	public void viewGrades()
	{
		
	}
	public void payFee()
	{
		
	}
	public void viewNotification(){
		
	}
	public void studentRegistration(Student std){
		
		try {
			studentList.add(std);
		System.out.println("Student is successfully registered...!!!");
		System.out.println(std.toString());
		}
		catch(BadRequestException ex){
			ex.getMessage();
			ex.printStackTrace();
		}
		
		}
	}

