package com.employeewageproblem;
/*Program to refactor the code using Class method to compute Employee Wage*/
public class EmployeeWageComputation {
    public static void totalWage(){                       //create a new method
        final int IS_PART_TIME = 1;
        final int IS_FULL_TIME = 2;
        final int EMP_RATE_PER_HOUR = 20;
        final int NUM_OF_WORKING_DAYS = 20;
        final int NUM_OF_WORKING_HRS = 100;
        //variables
        int totalEmployeeWage = 0;
        int employeeHours;
        System.out.printf("%5s     %5s   %5s   %5s\n", "Day", "Working hours", "Total working hours", "Wage");
        // Computation
        for (int day = 1, totalWorkingHrs = 0; day <= NUM_OF_WORKING_DAYS
                && totalWorkingHrs < NUM_OF_WORKING_HRS; day++, totalWorkingHrs += employeeHours){
            int empCheck = (int) Math.floor(Math.random() * 100) % 3;
            switch (empCheck){
                case IS_FULL_TIME:
                    employeeHours = 8;
                    break;
                case IS_PART_TIME:
                    employeeHours = 4;
                    break;
                default:
                    employeeHours = 0;
                    break;
            }
            int employeeWage = employeeHours * EMP_RATE_PER_HOUR;
            totalEmployeeWage += employeeWage;
            System.out.printf("%5d      %5d            %5d            %5d\n", day, employeeHours, totalWorkingHrs + employeeHours, employeeWage);
        }
        System.out.println("Total employee wage for a month is " + totalEmployeeWage);
    }
    public static void main(String[] args) {
        totalWage();                              //Calling the method totalWage
    }
}