package com.lti.bean;

import java.util.ArrayList;
import java.util.List;

public class GradeCard {

	private int sID;
	private int semester;
	private float cpi;
	private List<RegisteredCourses> rcourses = new ArrayList<RegisteredCourses>();

	public GradeCard(int sID, int semester, float cpi, List<RegisteredCourses> rcourses) {
		this.sID = sID;
		this.semester = semester;
		this.cpi = cpi;
		this.rcourses = rcourses;
	}

	public GradeCard() {
	}

	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public float getCpi() {
		return cpi;
	}

	public void setCpi(float cpi) {
		this.cpi = cpi;
	}

	public List<RegisteredCourses> getRcourses() {
		return rcourses;
	}

	public void setRcourses(List<RegisteredCourses> rcourses) {
		this.rcourses = rcourses;
	}

}
