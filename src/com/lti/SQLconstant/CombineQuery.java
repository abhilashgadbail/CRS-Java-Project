package com.lti.SQLconstant;

public class CombineQuery {

	public static final String loginSql = "select * from user where user.userId= ? and user.password=?";

	public static final String removeProfessorSql = "DELETE FROM professor WHERE professor.pId=? ";

}
