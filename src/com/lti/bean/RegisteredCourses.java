package com.lti.bean;

public class RegisteredCourses {

	private String courseCode;
	private int semester;
	private int sId;
	private String grade;

	public RegisteredCourses(String courseCode, int semester, int sId, String grade) {
		this.courseCode = courseCode;
		this.semester = semester;
		this.sId = sId;
		this.grade = grade;
	}

	public RegisteredCourses() {
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
