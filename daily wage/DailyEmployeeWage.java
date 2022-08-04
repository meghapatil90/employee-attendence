package com.employee;

public class DailyEmployeeWage {

	public static void main(String[] args) {

		int ISPRESENT = 1;
		int wagePerHour = 20;
		int workingHrs = 8;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == ISPRESENT)
			if (empCheck == ISPRESENT) {
				// use case 2:employee daily wage
				int empwage = wagePerHour * workingHrs;
				System.out.println("Employee is present");

				System.out.println("Employee wage = " + empwage);
			} else
				System.out.println("Employee is abscent");
	}

}
