package com.lti.bean;

/**
 * @author user245
 *
 */
public class Course {
	
	private int cId;
	private String cName;
	private int cSemester;
	private double cFees;
	private int cDuration;
	/**
	 * @return the cId
	 */
	public int getcId() {
		return cId;
	}
	public Course(int cId, String cName, int cSemester, double cFees,
			int cDuration) {
		
		this.cId = cId;
		this.cName = cName;
		this.cSemester = cSemester;
		this.cFees = cFees;
		this.cDuration = cDuration;
	}
	
	public Course() {
		
		
	}
	
	
	/**
	 * @param cId the cId to set
	 */
	public void setcId(int cId) {
		this.cId = cId;
	}
	/**
	 * @return the cName
	 */
	public String getcName() {
		return cName;
	}
	/**
	 * @param cName the cName to set
	 */
	public void setcName(String cName) {
		this.cName = cName;
	}
	/**
	 * @return the cSemester
	 */
	public int getcSemester() {
		return cSemester;
	}
	/**
	 * @param cSemester the cSemester to set
	 */
	public void setcSemester(int cSemester) {
		this.cSemester = cSemester;
	}
	/**
	 * @return the cFees
	 */
	public double getcFees() {
		return cFees;
	}
	/**
	 * @param cFees the cFees to set
	 */
	public void setcFees(double cFees) {
		this.cFees = cFees;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", cSemester="
				+ cSemester + ", cFees=" + cFees + ", cDuration=" + cDuration
				+ "]";
	}
	/**
	 * @return the cDuration
	 */
	public int getcDuration() {
		return cDuration;
	}
	/**
	 * @param cDuration the cDuration to set
	 */
	public void setcDuration(int cDuration) {
		this.cDuration = cDuration;
	}
	
	

}
