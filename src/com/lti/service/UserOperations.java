package com.lti.service;

import java.util.HashMap;
import java.util.Map;

import com.lti.application.AdminCrsMenu;
import com.lti.application.ProfessorCrsMenu;
import com.lti.application.StudentCrsMenu;
import com.lti.exception.EntityNotFoundException;

public class UserOperations {
	
	 AdminCrsMenu adminCrsMenu= new AdminCrsMenu();
	 StudentCrsMenu studentCrsMenu= new StudentCrsMenu();
	 ProfessorCrsMenu professorCrsMenu=new ProfessorCrsMenu();
	
	public void adminLogin(String userId, String password) throws EntityNotFoundException {
		
		Map<String, String> userCreds = new HashMap<String, String>();
		Map<String, String> matchedCreds = new HashMap<String, String>();
		userCreds.put("xyz@gmail.com", "xyz123");
		userCreds.put("abc@gmail.com","abc@123");
		userCreds.put("abc1@gmail.com","abc@123");

		userCreds.put("123","123");
		for (Map.Entry<String, String> entry : userCreds.entrySet()){

		   if (entry.getKey().equals(userId) && entry.getValue().equals(password)){
		      matchedCreds.put(entry.getKey(),entry.getValue());
		   }
		}
		if (matchedCreds.size()>0){
		   System.out.println("Sucessfully logged In");
		   adminCrsMenu.Admindisplay();
		   
		}
		else
			throw new EntityNotFoundException("invalid credentials");
		 //  System.out.println("invalid credentials");
	}

	public void loginAsStudent(String userId, String password) {
		// TODO Auto-generated method stub
		
		Map<String, String> userCreds = new HashMap<String, String>();
		Map<String, String> matchedCreds = new HashMap<String, String>();
		userCreds.put("159", "159");
		userCreds.put("357","357");
		
		for (Map.Entry<String, String> entry : userCreds.entrySet()){

		   if (entry.getKey().equals(userId) && entry.getValue().equals(password)){
		      matchedCreds.put(entry.getKey(),entry.getValue());
		   }
		}
		if (matchedCreds.size()>0){
		   System.out.println("Sucessfully logged In");
		   
		   studentCrsMenu.studentDisplay();
		   
		}
		else
		   System.out.println("invalid credentials");
		
	}
	
	public void loginAsProfessor(String userId, String password) {
		// TODO Auto-generated method stub
		
		Map<String, String> userCreds = new HashMap<String, String>();
		Map<String, String> matchedCreds = new HashMap<String, String>();
		userCreds.put("741", "741");
		userCreds.put("852","852");
		userCreds.put("963","963");

		for (Map.Entry<String, String> entry : userCreds.entrySet()){

		   if (entry.getKey().equals(userId) && entry.getValue().equals(password)){
		      matchedCreds.put(entry.getKey(),entry.getValue());
		   }
		}
		if (matchedCreds.size()>0){
		   System.out.println("Sucessfully logged In");
		   
		   professorCrsMenu.professorDisplay();
		   
		}
		else
		   System.out.println("invalid credentials");
		
	}

}
