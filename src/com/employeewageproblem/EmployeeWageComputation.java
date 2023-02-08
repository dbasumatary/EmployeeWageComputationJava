package com.employeewageproblem;
/*Program to calculate wages for a month assuming 20 working days*/
public class EmployeeWageComputation {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static void main(String[] args) {
        //Variables
        int employeeHours;
        int employeeWage;
        int totalEmployeeWage = 0;
        // Computation
        for (int day = 1; day <= NUM_OF_WORKING_DAYS; day++){
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck){
                case IS_FULL_TIME:
                    employeeHours = 8;
                    System.out.println("Day "+day+": Employee is present full time");
                    break;
                case IS_PART_TIME:
                    employeeHours = 4;
                    System.out.println("Day "+day+": Employee is present part time");
                    break;
                default:
                    employeeHours = 0;
                    System.out.println("Day "+day+": Employee is absent");
            }
            employeeWage = employeeHours * EMP_RATE_PER_HOUR;
            totalEmployeeWage += employeeWage;
            System.out.println("The employee wage is " + employeeWage);
        }
        System.out.println("Total employee wage for a month is " + totalEmployeeWage);
    }
}