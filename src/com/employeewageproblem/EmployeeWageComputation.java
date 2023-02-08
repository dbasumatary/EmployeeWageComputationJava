package com.employeewageproblem;
/*Modified the previous program to write using Switch Case*/
public class EmployeeWageComputation {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static void main(String[] args) {
        //Variables
        int employeeHours;
        int employeeWage;
        // Computation
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck){
            case IS_FULL_TIME:
                employeeHours = 8;
                System.out.println("Employee is present full time");
                break;
            case IS_PART_TIME:
                employeeHours = 4;
                System.out.println("Employee is present part time");
                break;
            default:
                employeeHours = 0;
                System.out.println("Employee is absent");
        }
        employeeWage = employeeHours * EMP_RATE_PER_HOUR;
        System.out.println("Employee daily wage is " + employeeWage);
    }
}