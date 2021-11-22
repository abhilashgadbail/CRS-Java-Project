package com.lti.dao;

import com.lti.SQLconstant.CombineQuery;
import com.lti.exception.BadRequestException;
import com.lti.exception.EntityNotFoundException;
import com.lti.exception.TransectionFailedException;
import com.lti.util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAOOperations {

	public void registerStudent(String sName, String sCourseName, int deptId, String dptName, int sem, String email,String password) throws SQLException, EntityNotFoundException {
		// TODO Auto-generated method stub
		Connection conn = DBUtils.getConnection();
		PreparedStatement statement =null;

		int min = 200;
		int max = 400;
		int courseId =0;


		int userId = (int)(Math.random()*(max-min+1)+min);

		statement =conn.prepareStatement(CombineQuery.getCourseOnTheBasisOfCourseName);
		statement.setString(1,sCourseName);
	    ResultSet rs = statement.executeQuery();
		if (rs.next()){
		courseId =rs.getInt("cId");
		}
		else
			throw new EntityNotFoundException("please enter a valid course name");

		statement = conn.prepareStatement(CombineQuery.insertStudent);
		 statement.setInt(1,userId);
		 statement.setString(2,sName);
		 statement.setString(3,null);
		 statement.setInt(4,courseId);
		 statement.setInt(5,deptId);
		 statement.setString(6,dptName);
		 statement.setString(7,email);
		 statement.setBoolean(8,false);
		 statement.setInt(9,0);
		 statement.executeUpdate();

		 if (!email.equals(null) || !password.equals(null)) {
			 statement = conn.prepareStatement(CombineQuery.addUser);
			 statement.setInt(1, userId);
			 statement.setString(2, password);
			 statement.setString(3, "student");
			 statement.executeUpdate();

			 System.out.println("Successfully registered as student");
		 }
		 else
			 throw new BadRequestException("please enter the email id and password");
	}


	public void addPayment(int rollNo, int amount) throws SQLException, TransectionFailedException {

		Connection conn = DBUtils.getConnection();
		PreparedStatement statement =null;

		statement = conn.prepareStatement(CombineQuery.addPayment);
		statement.setInt(1, rollNo);
		statement.setInt(2, amount);
		statement.setInt(3, 0);
		if (amount>0) {
			statement.setBoolean(4,true);
			statement.executeUpdate();
		}
		else
			throw new TransectionFailedException("transection failed please try again later");
	}
}
