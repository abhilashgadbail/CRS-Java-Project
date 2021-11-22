package com.lti.application;



import java.util.Scanner;



import com.lti.service.ProfessorOperations;



/**
 * @author Hp
 *
 */
public class ProfessorCrsMenu {

	static ProfessorOperations po=new ProfessorOperations();

	public static void professorDisplay() {
		System.out.println("Welcome Professor ..!!");
		System.out.println("1. ViewEnrolledStudents \n" + "2. addGrade \n" +
				"3. Exit");
		System.out.println("Please enter your choice...!");
		boolean exit=false;
		do {
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();


			switch (input) {
				case 1:

					po.viewEnrolledStudents();
					break;



				case 2:

					System.out.println("Enter the std id for the garde to be added");
					int sId=sc.nextInt();
					System.out.println("Enter the garde to be added");
					String sGrade=sc.next();

					po.addGrade(sId,sGrade);
					break;


				case 3:

					System.out.println("Exited Successfully from Application");
					exit=true;
					break;

				default:



					professorDisplay();
			}



		}
		while (!exit);
	}

}