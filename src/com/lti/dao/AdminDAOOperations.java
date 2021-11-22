package com.lti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lti.SQLconstant.CombineQuery;
import com.lti.bean.Course;
import com.lti.bean.Professor;
import com.lti.exception.EntityNotFoundException;
import com.lti.util.DBUtils;

public class AdminDAOOperations {

	static List<Professor> profList = new ArrayList<Professor>();

	Connection conn = null;
	PreparedStatement stmt = null;

	public void addToCourse(int courseId, String cName2, int semester, double fees2, int duration2) {

		try {

			// Step 3 Regiater Driver here and create connection

			Class.forName("com.mysql.jdbc.Driver");

			// Step 4 make/open a connection

			System.out.println("Connecting to database...");
			conn = DBUtils.getConnection();

			// STEP 4: Execute a query
			System.out.println("Creating statement...");

			String sql = "insert into course values(?,?,?,?,?)";
			// String sql = "UPDATE Employees set age=? WHERE id=?";
			// String sql1="delete from employee where id=?";
			// stmt.setInt(1, 101);
			stmt = conn.prepareStatement(sql);

			// Hard coded data

			// Bind values into the parameters.
			stmt.setInt(1, courseId); // This would set age
			stmt.setString(2, cName2);
			stmt.setInt(3, semester);
			stmt.setDouble(4, fees2);
			stmt.setInt(5, duration2);
			stmt.executeUpdate();

			// Let us update age of the record with ID = 102;
			// int rows = stmt.executeUpdate();
			// System.out.println("Rows impacted : " + rows );

			// Let us select all the records and display them.
			sql = "SELECT cId, cName, cSemester,cFees,cDuration FROM course";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int cId = rs.getInt("cId");
				String courseName = rs.getString("cName");
				int sem = rs.getInt("cSemester");
				double fee = rs.getDouble("cFees");
				int dur = rs.getInt("cDuration");

				// Display values
				System.out.print("ID: " + cId);
				System.out.print(", Course Name: " + courseName);
				System.out.print(", Semester: " + sem);
				System.out.println(", Fees: " + fee);
				System.out.println(", Duration of Course: " + dur);
			}
			// STEP 6: Clean-up environment
			// rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");

	}
	
	public void addProfessorDetails(int pId, String pName, int pCourseId, int pDeptId, String pDeptName,
			String pEmailId){

		try {

			
			// Step 3 Regiater Driver here and create connection

			Class.forName("com.mysql.jdbc.Driver");

			// Step 4 make/open a connection

			System.out.println("Connecting to database...");
			conn = DBUtils.getConnection();

			// STEP 4: Execute a query
			System.out.println("Creating statement...");

			String sql = "insert into professor values(?,?,?,?,?,?)";
			// String sql = "UPDATE Employees set age=? WHERE id=?";
			// String sql1="delete from employee where id=?";
			// stmt.setInt(1, 101);
			stmt = conn.prepareStatement(sql);

			// Hard coded data

			// Bind values into the parameters.
			stmt.setInt(1, pId); // This would set age
			stmt.setString(2, pName);
			stmt.setInt(3, pCourseId);
			stmt.setInt(4, pDeptId);
			stmt.setString(5, pDeptName);			
			stmt.setString(6, pEmailId);
			//stmt.setDate(7, (java.sql.Date) dOJ);
			
			System.out.println("bofore ************");
			stmt.executeUpdate();

			// Let us update age of the record with ID = 102;
			// int rows = stmt.executeUpdate();
			// System.out.println("Rows impacted : " + rows );

			// Let us select all the records and display them.
			sql = "SELECT pId,  pName, pCourseId, pDeptId, pDeptName, pEmailId FROM professor";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int pId1 = rs.getInt("pId");
				String pName1 = rs.getString("pName");
				int pCourseId1 = rs.getInt("pCourseId");
				int pDeptId1 = rs.getInt("pDeptId");
				String pDeptName1 = rs.getString("pDeptName");
				String pEmailId1 = rs.getString("pEmailId");

				
				// Display values
				System.out.print("ProfessorID: " + pId1);
				System.out.print(", Professor Name: " + pName1);
				System.out.print(", Course iD: " + pCourseId1);
				System.out.println(", Department ID " + pDeptId1);
				System.out.println(", Department: " + pDeptName1);

				System.out.println(", Email Id: " + pEmailId1);
				
			}
			// STEP 6: Clean-up environment
			// rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");

	}
	
	public void removeProf(int pid) throws SQLException, EntityNotFoundException {
		
		conn = DBUtils.getConnection();
		stmt = conn.prepareStatement(CombineQuery.removeProfessorSql);
		
		stmt.setInt(1, pid);
		
		int resultset=stmt.executeUpdate();
		
		if(resultset!=0) {
			System.out.println("Professor Successsfully removed");
			
		}
		
		else 
			throw new EntityNotFoundException("NOT Found any professor with this ID ");
		
	}
	

public void approveStudentRegistration(int sId) throws EntityNotFoundException, SQLException {
        Connection conn = null;
		PreparedStatement stmt = null;
		conn =DBUtils.getConnection();
		String sql = "SELECT sId, transactionId, amount,status FROM payment"; 
		stmt = conn.prepareStatement(sql);
		
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			// Retrieve by column name
			//int sid = rs.getInt("sId");
		     if (rs.getInt("sId") == sId && rs.getString("status")=="true") {
				System.out.println("Student registration approval done  successfully");
			
         }
		else
			throw new EntityNotFoundException("No Student Found with Id: "+sId);
	}
}

	
	
}
