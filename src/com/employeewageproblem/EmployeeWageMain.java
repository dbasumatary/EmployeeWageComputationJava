package com.employeewageproblem;
import java.util.Scanner;
public class EmployeeWageMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation");
        System.out.println("************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of companies: ");
        int number = scanner.nextInt();
        EmployeeWageBuilder empWageBuilder = new EmployeeWageComputation(number);                 //Object creation
        for (int i = 0; i < number; i++) {
            System.out.println("Enter Company Details as given:\n1. CompanyName\t2. EmployeeRatePerHour\t3. NoOfWorkingDays\n4. MaxHoursPerMonth");
            empWageBuilder.addCompany(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }
        empWageBuilder.computeEmpWage();                 // Method calling
        System.out.println("Enter the company name: ");
        /*The total wage will be shown after being asked to enter the company name*/
        System.out.println("The total employee wage is " + empWageBuilder.getTotalWage(scanner.next()));
    }
}
