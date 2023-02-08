package com.employeewageproblem;
/*Program to calculate wages till total 100 working hours and 20 days is reached*/
public class EmployeeWageComputation {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;
    public static void main(String[] args) {
        //Variables
        int totalEmployeeWage;
        int totalEmployeeHours = 0;
        int totalWorkingDays = 0;
        // Computation
        while (totalEmployeeHours <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            int employeeHours;
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    employeeHours = 8;
                    System.out.println("Day " + totalWorkingDays + ": Employee is present full time");
                    break;
                case IS_PART_TIME:
                    employeeHours = 4;
                    System.out.println("Day " + totalWorkingDays + ": Employee is present full time");
                    break;
                default:
                    employeeHours = 0;
                    System.out.println("Day " + totalWorkingDays + ": Employee is present full time");
            }
            totalEmployeeHours += employeeHours;
            System.out.println("Day " + totalWorkingDays + ": Employee Working Hours: " + employeeHours);
        }
        totalEmployeeWage = totalEmployeeHours * EMP_RATE_PER_HOUR;
        System.out.println("Total Employee Wage: " + totalEmployeeWage);
    }
}