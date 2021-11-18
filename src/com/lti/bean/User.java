package com.lti.bean;

public class User {
	private int userId;
	private String password;
	private String role;
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the userType
	 */
	public String getUserType() {
		return role;
	}
	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.role = userType;
	}
	

}
