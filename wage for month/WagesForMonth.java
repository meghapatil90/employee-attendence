package com.employee;

public class WagesForMonth {

	// CONSTANTS
	public static final int isFullTime1 = 1;
	public static final int isPartTime1 = 2;
	public static final int wagePerHour = 20;
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int empRatePerHour = 20;
	public static final int noOfWorkingDay = 20;

	public static void main(String[] args) {
		// VARIABLE
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		// computation
		for (int day = 0; day < noOfWorkingDay; day++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case isPartTime1:
				empHrs = 4;
				break;
			case isFullTime1:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			empWage = empHrs * empRatePerHour;
			totalEmpWage += empWage;
			System.out.println("Emp Wage: " + empWage);
		}
		System.out.println("total Emp Wage: = " + totalEmpWage);

		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		case isFullTime1:
			empHrs = 8;
			break;
		case isPartTime1:
			empHrs = 4;
			break;
		default:
			empHrs = 0;
		}
		empWage = empHrs * wagePerHour;
		System.out.println("Emp wage = " + empWage);
	}
}
