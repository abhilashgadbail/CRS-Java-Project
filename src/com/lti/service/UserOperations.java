package com.lti.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import com.lti.SQLconstant.CombineQuery;
import com.lti.application.AdminCrsMenu;
import com.lti.application.ProfessorCrsMenu;
import com.lti.application.StudentCrsMenu;
import com.lti.exception.EntityNotFoundException;
import com.lti.exception.StatusNotApprovedException;
import com.lti.exception.TransectionFailedException;
import com.lti.util.DBUtils;

public class UserOperations {
	
	 AdminCrsMenu adminCrsMenu= new AdminCrsMenu();
	 StudentCrsMenu studentCrsMenu= new StudentCrsMenu();
	 ProfessorCrsMenu professorCrsMenu=new ProfessorCrsMenu();
	
	public void login(String userId, String password) throws EntityNotFoundException, SQLException, ParseException, StatusNotApprovedException, TransectionFailedException {
		
		
		Connection conn = null;
		PreparedStatement stmt = null;
		conn = DBUtils.getConnection();
		boolean approvalStatus =false;

		//String CombineQuery.sql="select * from user where user.userId= ? and user.password=?";

		stmt = conn.prepareStatement(CombineQuery.loginSql);
		
		stmt.setInt(1,Integer.parseInt(userId));
		stmt.setString(2,password);
		
		ResultSet resultSet = stmt.executeQuery();
		if (resultSet.next())
		{
		   if(resultSet.getString("userId").equals(userId)&&
		   resultSet.getString("password").equals(password) &&resultSet.getString("role").equals("admin")){
		      System.out.println("Sucessfully logged In");
		      adminCrsMenu.Admindisplay();
		   }
		   else if(resultSet.getString("userId").equals(userId)&&
		         resultSet.getString("password").equals(password) &&resultSet.getString("role").equals("student")){

				String studentApprovalStatus = "select aprovalStatus from student where student.sRollNo =?";
			   stmt =conn.prepareStatement(studentApprovalStatus);
			   stmt.setString(1,userId);
			   ResultSet rs = stmt.executeQuery();
			   if (rs.next()){
				   approvalStatus = rs.getBoolean("aprovalStatus");
			   }
		   	System.out.println("Sucessfully logged In");

			   if (approvalStatus) {
				   studentCrsMenu.studentDisplay();
			   }
			   else
				   System.out.println("sorry your approval is not found");
		   }
		   else if(resultSet.getString("userId").equals(userId)&&
		         resultSet.getString("password").equals(password) &&resultSet.getString("role").equals("professor")){
		      System.out.println("Sucessfully logged In");
		      professorCrsMenu.professorDisplay();
		   }


	}
		else 
			throw new EntityNotFoundException("Invalid Credentials");

}
	
}
