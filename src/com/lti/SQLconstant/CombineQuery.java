package com.lti.SQLconstant;

public class CombineQuery {

	public static final String loginSql = "select * from user where user.userId= ? and user.password=?";
	public static final String removeProfessorSql = "DELETE FROM professor WHERE professor.pId=? ";
	public static final String removeCourseSql = "DELETE FROM course WHERE course.cId=?";
	public static final String  getCourseOnTheBasisOfCourseName = "select * from course where course.cName=?";
	public static final String addPayment = "insert into payment values(?,?,?,?)";
	public static final String addUser = "insert into user values(?,?,?)";
	public static final String insertStudent="insert into student values(?,?,?,?,?,?,?,?,?)";
	public static final String fetchPayment = "select  * FROM payment where payment.sId=?";
	public static final String  approveStudentRegistration = "update student set aprovalStatus =? where sRollNo =?";

}
