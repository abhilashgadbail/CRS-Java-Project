package com.lti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lti.bean.Course;
import com.lti.util.DBUtils;

public class AdminDAOOperations {

	// List<Course> course= new ArrayList<Course>();
	Course course1 = new Course(1001, "Civil", 8, 2000, 6);

	public void addToCourse() {

		/*
		 * private int cId; private String cName; private int cSemester; private double
		 * cFees; private int cDuration;
		 */

		// course.add(new Course(1001,"Civil",8,2000,6));
		/*
		 * course.add(new Course(102, "CTIT", 8, 50000.00, 4)); course.add(new
		 * Course(103, "Mechanical", 8, 50000.00, 4));
		 */

		Connection conn = null;
		PreparedStatement stmt = null;

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

			int id = course1.getcId();
			String cName = course1.getcName();
			int cSemester = course1.getcSemester();
			double fees = course1.getcFees();
			int duration = course1.getcDuration();

			// Bind values into the parameters.
			stmt.setInt(1, id); // This would set age
			stmt.setString(2, cName);
			stmt.setInt(3, cSemester);
			stmt.setDouble(4, fees);
			stmt.setInt(5, duration);
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
}
