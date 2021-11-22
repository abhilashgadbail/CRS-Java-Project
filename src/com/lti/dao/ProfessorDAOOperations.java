package com.lti.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import com.lti.bean.Course;
import com.lti.util.DBUtils;



public class ProfessorDAOOperations {
//Course course1 = new Course(1001, "Civil", 8, 2000, 6);



    public void ViewEnrStudents() {
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



            String sql = "select * from student where sCourseId>0";

            stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
// Retrieve by column name
                int sId = rs.getInt("sRollNo");
                String studentName = rs.getString("sName");
                String sGrade = rs.getString("sGrade");
                int dId = rs.getInt("sDeptId");
                String sDptName = rs.getString("sDeptName");
                String sMail = rs.getString("sEmailId");



// Display values
                System.out.print("sID: " + sId);
                System.out.print(", Student NAme: " + studentName);
                System.out.print(", sGrade: " + sGrade);
                System.out.print(", sDeptId: " + dId);
                System.out.print(", sDeptName: " + sDptName);
                System.out.print(", sEmailId: " + sMail);
                System.out.println();
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
    public void addStudentGrade(int sID,String sGrade)
    {

        try {
            Connection conn = null;
            PreparedStatement stmt = null;



            System.out.println("Connecting to database...");
          conn=  DBUtils.getConnection();
            System.out.println("Creating statement...");
            System.out.println(" "+sGrade+""+sID);
            String sql123 = "update student set student.sGrade=? where student.sRollNo=?";
            stmt = conn.prepareStatement(sql123);

            stmt.setString(1,sGrade);
            stmt.setInt(2,sID);

            stmt.executeUpdate();


// System.out.println(" "+sGrade+""+sID);
            String sql = "select * from student where sCourseId>0";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("updated in db");



            while (rs.next()) {
// Retrieve by column name
                int sId = rs.getInt("sRollNo");
                String studentName = rs.getString("sName");
                String Grade = rs.getString("sGrade");
                int dId = rs.getInt("sDeptId");
                String sDptName = rs.getString("sDeptName");
                String sMail = rs.getString("sEmailId");



// Display values
                System.out.print("sID: " + sId);
                System.out.print(", Student NAme: " + studentName);
                System.out.print(", sGrade: " + Grade);
                System.out.print(", sDeptId: " + dId);
                System.out.print(", sDeptName: " + sDptName);
                System.out.print(", sEmailId: " + sMail);
                System.out.println();
            }
        }
        catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }

    }



}