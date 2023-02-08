package com.employeewageproblem;
public class EmployeeWageComputation {
    public static void main(String[] args) {
        // Constants
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        //Variables
        int employeeHours;
        int employeeWage;
        // Computation
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is present");
            employeeHours = 8;
        }
        else {
            System.out.println("Employee is absent");
            employeeHours = 0;
        }
        employeeWage = employeeHours * EMP_RATE_PER_HOUR;
        System.out.println("Employee daily wage is " + employeeWage);
    }
}