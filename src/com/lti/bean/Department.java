package com.lti.bean;

public class Department {
	
	private int deptId;
	private String deptName;
	private String dHOD;
	/**
	 * @return the deptId
	 */
	public int getDeptId() {
		return deptId;
	}
	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}
	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	/**
	 * @return the dHOD
	 */
	public String getdHOD() {
		return dHOD;
	}
	/**
	 * @param dHOD the dHOD to set
	 */
	public void setdHOD(String dHOD) {
		this.dHOD = dHOD;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName
				+ ", dHOD=" + dHOD + "]";
	}

}
