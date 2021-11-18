/**
 * 
 */
package com.lti.bean;

import java.util.Date;

/**
 * @author HP
 *
 */
public class SemesterRegistration {
	
	private int sId;
	private int semester;
	private Date dateOfRegistration;
	
	
	
	public SemesterRegistration() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	public SemesterRegistration(int sId, int semester, Date dateOfRegistration) {
		super();
		this.sId = sId;
		this.semester = semester;
		this.dateOfRegistration = dateOfRegistration;
	}



	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}



	@Override
	public String toString() {
		return "SemesterRegistration [sId=" + sId + ", semester=" + semester + ", dateOfRegistration="
				+ dateOfRegistration + "]";
	}
	
	
	/**
	 * 
	 */
	
	
}