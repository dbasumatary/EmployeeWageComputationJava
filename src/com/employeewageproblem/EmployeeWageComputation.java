package com.employeewageproblem;
/*Added part-time employee and wage to previous program*/
public class EmployeeWageComputation {
    public static void main(String[] args) {
        // Constants
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        //Variables
        int employeeHours;
        int employeeWage;
        // Computation
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is present full time");
            employeeHours = 8;
        }
        else if (empCheck == IS_PART_TIME) {
            System.out.println("Employee is present part time");
            employeeHours = 4;
        }
        else {
            System.out.println("Employee is absent");
            employeeHours = 0;
        }
        employeeWage = employeeHours * EMP_RATE_PER_HOUR;
        System.out.println("Employee daily wage is " + employeeWage);
    }
}