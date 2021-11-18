package com.lti.bean;

public class Professor {

	private int pId;
	private String pName;
	private int pCourseId;
	private int pDeptId;
	private String pDeptName;
	private String pEmailId;
	private String pUserName;
	private String pPassWord;
	
	public Professor() {
		
	}

	public Professor(int pid, String name, int cid, int deptid, String deptname,String emailid) {
		// TODO Auto-generated constructor stub
		this.pId=pid;
		this.pName=name;
		this.pCourseId=cid;
		this.pDeptId=deptid;
		this.pDeptName=deptname;
		this.pEmailId=emailid;
		
		
	}
	
	public String getpUserName() {
		return pUserName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	/**
	 * @param pUserName the pUserName to set
	 */
	public void setpUserName(String pUserName) {
		this.pUserName = pUserName;
	}
	/**
	 * @return the pPassWord
	 */
	public String getpPassWord() {
		return pPassWord;
	}
	/**
	 * @param pPassWord the pPassWord to set
	 */
	public void setpPassWord(String pPassWord) {
		this.pPassWord = pPassWord;
	}
	
	/**
	 * @return the pEmailId
	 */
	public String getpEmailId() {
		return pEmailId;
	}
	/**
	 * @param pEmailId the pEmailId to set
	 */
	public void setpEmailId(String pEmailId) {
		this.pEmailId = pEmailId;
	}
	/**
	 * @return the pDeptId
	 */
	public int getpDeptId() {
		return pDeptId;
	}
	/**
	 * @param pDeptId the pDeptId to set
	 */
	public void setpDeptId(int pDeptId) {
		this.pDeptId = pDeptId;
	}
	/**
	 * @return the pDeptName
	 */
	public String getpDeptName() {
		return pDeptName;
	}
	/**
	 * @param pDeptName the pDeptName to set
	 */
	public void setpDeptName(String pDeptName) {
		this.pDeptName = pDeptName;
	}
	
	/**
	 * @return the pId
	 */
	public int getpId() {
		return pId;
	}
	/**
	 * @param pId the pId to set
	 */
	public void setpId(int pId) {
		this.pId = pId;
	}
	/**
	 * @return the pName
	 */
	public String getpName() {
		return pName;
	}
	/**
	 * @param pName the pName to set
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}
	/**
	 * @return the pCourseId
	 */
	public int getpCourseId() {
		return pCourseId;
	}
	/**
	 * @param pCourseId the pCourseId to set
	 */
	public void setpCourseId(int pCourseId) {
		this.pCourseId = pCourseId;
	}
	/**
	 * @return the pDeptment
	 */

	
	public String toString() {
		return "Professor [pId=" + pId + ", pName=" + pName + ", pCourseId="
				+ pCourseId + ", pDeptId=" + pDeptId + ", pDeptName="
				+ pDeptName + ", pEmailId=" + pEmailId
				+ "]";
	}
	
	
}
