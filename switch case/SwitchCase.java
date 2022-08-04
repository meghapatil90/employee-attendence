package com.employee;

public class SwitchCase {

	public static final int isFullTime = 1;
	public static final int isPartTime = 2;
	public static final int wagePerHour = 20;

	public static void main(String[] args) {
		// use case 1:check employee attendence
		// CONSTANTS
		int ISPRESENT = 1;
		int wagePerHour = 20;
		int workingHrs = 8;
		int partTimeHour = 4;
		int partTimeWorkingDay = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == ISPRESENT) {
			// use case 2:employee daily wage
			int empwage = wagePerHour * workingHrs;
			// use case 3:part time employee and wage
			int empwage1 = wagePerHour * partTimeHour;
			System.out.println("Employee is present");
			System.out.println("Employee wage = " + empwage);
			System.out.println("Employee is present as part time ");
			System.out.println("Employee wage per day is : " + empwage1);
			// VARIABLE
			int empHrs = 0;
			int empWage = 0;

			int empCheck1 = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck1) {
			case isFullTime:
				empHrs = 8;
				break;
			case isPartTime:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			empWage = empHrs * wagePerHour;
			System.out.println("Emp wage = " + empWage);

		} else
			System.out.println("Employee is abscent");
	}

}
