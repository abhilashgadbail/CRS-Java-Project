package com.lti.bean;

public class Student {

	/**
	 * @return the sRollNo
	 */

	private int sRollNo;
	private String sName;
	private String sGrade;
	private String sCourseId;
	private String sDeptId;
	private String sDeptName;
	private String sEmailId;
	private String sUserName;
	private String sPassWord;
	private boolean aprovalStatus;

	public Student(int sRollNo, String sName, String sEmailId, boolean aprovalStatus) {
		super();
		this.sRollNo = sRollNo;
		this.sName = sName;
		this.sEmailId = sEmailId;
		this.aprovalStatus = aprovalStatus;
	}

	public boolean isAprovalStatus() {
		return aprovalStatus;
	}

	public void setAprovalStatus(boolean aprovalStatus) {
		this.aprovalStatus = aprovalStatus;
	}

	public Student() {
	}

	/**
	 * @return the sUserName
	 */

	public String getsUserName() {
		return sUserName;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	/**
	 * @param sUserName
	 *            the sUserName to set
	 */
	public void setsUserName(String sUserName) {
		this.sUserName = sUserName;
	}

	/**
	 * @return the sPassWord
	 */
	public String getsPassWord() {
		return sPassWord;
	}

	/**
	 * @param sPassWord
	 *            the sPassWord to set
	 */
	public void setsPassWord(String sPassWord) {
		this.sPassWord = sPassWord;
	}

	/**
	 * @return the sEmailId
	 */
	public String getsEmailId() {
		return sEmailId;
	}

	/**
	 * @param sEmailId
	 *            the sEmailId to set
	 */
	public void setsEmailId(String sEmailId) {
		this.sEmailId = sEmailId;
	}

	public int getsRollNo() {
		return sRollNo;
	}

	/**
	 * @param sRollNo
	 *            the sRollNo to set
	 */
	public void setsRollNo(int sRollNo) {
		this.sRollNo = sRollNo;
	}

	/**
	 * @return the sName
	 */
	public String getsName() {
		return sName;
	}

	/**
	 * @param sName
	 *            the sName to set
	 */
	public void setsName(String sName) {
		this.sName = sName;
	}

	/**
	 * @return the sGrade
	 */
	public String getsGrade() {
		return sGrade;
	}

	/**
	 * @param sGrade
	 *            the sGrade to set
	 */
	public void setsGrade(String sGrade) {
		this.sGrade = sGrade;
	}

	/**
	 * @return the sCourseId
	 */
	public String getsCourseId() {
		return sCourseId;
	}

	/**
	 * @param sCourseId
	 *            the sCourseId to set
	 */
	public void setsCourseId(String sCourseId) {
		this.sCourseId = sCourseId;
	}

	/**
	 * @return the sDeptId
	 */
	public String getsDeptId() {
		return sDeptId;
	}

	/**
	 * @param sDeptId
	 *            the sDeptId to set
	 */
	public void setsDeptId(String sDeptId) {
		this.sDeptId = sDeptId;
	}

	/**
	 * @return the sDeptName
	 */
	public String getsDeptName() {
		return sDeptName;
	}

	/**
	 * @param sDeptName
	 *            the sDeptName to set
	 */
	public void setsDeptName(String sDeptName) {
		this.sDeptName = sDeptName;
	}

	@Override
	public String toString() {
		return "Student [sRollNo=" + sRollNo + ", sName=" + sName + ", sGrade=" + sGrade + ", sCourseId=" + sCourseId
				+ ", sDeptId=" + sDeptId + ", sDeptName=" + sDeptName + ", sEmailId=" + sEmailId + ", sUserName="
				+ sUserName + ", sPassWord=" + sPassWord + ", aprovalStatus=" + aprovalStatus + "]";
	}

	

}
