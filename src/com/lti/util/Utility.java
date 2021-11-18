package com.lti.util;

public class Utility {

	public static String calculateCPI(float cpi) {

		String grade = "";

		if (cpi > 7) {
			grade = "B";
		} else if (cpi > 8) {
			grade = "A";
		} else
			grade = "E";
		return grade;

	}

}
