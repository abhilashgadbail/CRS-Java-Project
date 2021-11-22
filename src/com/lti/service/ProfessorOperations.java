package com.lti.service;



import com.lti.dao.ProfessorDAOOperations;



public class ProfessorOperations {

	ProfessorDAOOperations pDAO=new ProfessorDAOOperations();

	public void viewEnrolledStudents()
	{
		pDAO.ViewEnrStudents();
	}

	public void addGrade(int sId,String sGrade)
	{

		pDAO.addStudentGrade(sId,sGrade);
	}
	public void viewReportCard()
	{

	}

	public void viewCourse()
	{

	}
	public void paymentForCourse()
	{

	}





}