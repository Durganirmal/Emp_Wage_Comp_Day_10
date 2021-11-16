package com.Emp_Wage_Comp;

public class Employee_Wage_Computation {
	
	 public static final int IS_PART_TIME = 1;
	    public static final int IS_FULL_TIME = 2;

	    private final String company;
	    private final int empRatePerHr;
	    private final int numOfWorkingDays;
	    private final int maxHoursPerMonth;
	    private int totalEmpWage;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage computation Program!!");
		Employee_Wage_Computation kMart = new Employee_Wage_Computation("K'mart", 20, 20, 100);
		Employee_Wage_Computation bridgelabz = new Employee_Wage_Computation("Bridgelabz", 10, 20, 110);
		Employee_Wage_Computation JIO = new Employee_Wage_Computation("JIO", 15, 20, 80);
	        kMart.computeEmpWage();
	        System.out.println(kMart);
	        bridgelabz.computeEmpWage();
	        System.out.println(bridgelabz);
	        JIO.computeEmpWage();
	        System.out.println(JIO);
	    }

	    public Employee_Wage_Computation(String company, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) {
	        this.company = company;
	        this.empRatePerHr = empRatePerHr;
	        this.numOfWorkingDays = numOfWorkingDays;
	        this.maxHoursPerMonth = maxHoursPerMonth;
	    }

	    public void computeEmpWage() {
	        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
	        while (totalEmpHrs < maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
	            totalWorkingDays++;
	            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	            switch (empCheck) {
	                case IS_PART_TIME:
	                    empHrs = 4;
	                    break;
	                case IS_FULL_TIME:
	                    empHrs = 8;
	                    break;
	                default:
	                    empHrs = 0;
	            }
	            totalEmpHrs += empHrs;
	            System.out.println("Day-:" + totalWorkingDays + " Employee Hr:" + empHrs);
	        }
	        totalEmpWage = totalEmpHrs * empRatePerHr;
	    }

	    public String toString() {
	        return ("Total employee  Wage for the " + company + " is: " + totalEmpWage);
	    }
	    }
	


	


	


