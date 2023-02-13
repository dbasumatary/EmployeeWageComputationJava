package com.employeewageproblem;
import java.util.LinkedList;
/*Program to manage employee wage of multiple companies using ArrayList (UC12)*/
public class EmployeeWageComputation implements EmployeeWageBuilder{
    public static final int PART_TIME = 1;          // class constant
    public static final int FULL_TIME = 2;
    private LinkedList<CompanyEmpWage> companyEmpWageList;                        // instance variables
    //private CompanyEmpWage[] companyArray;
    public EmployeeWageComputation(int n) {                  //Constructor of same class
        companyEmpWageList = new LinkedList<>();
    }
    public void addCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHour, maxWorkingDays, maxWorkingHours);
        companyEmpWageList.add(companyEmpWage);
    }
    public void computeEmpWage() {
        for (int i = 0; i < companyEmpWageList.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
            companyEmpWage.setTotalEmployeeWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }
    public int computeEmpWage(CompanyEmpWage companyEmpWage) {           // Compute Wage method
        int empHrs;                                                      // Local variables
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        System.out.println("Calculating Wage for Company: " + companyEmpWage.COMPANY_NAME);
        while (totalEmpHrs <= companyEmpWage.MAX_WORKING_HRS && totalWorkingDays < companyEmpWage.MAX_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            // Case Checking
            switch (empCheck) {
                case PART_TIME:
                    empHrs = 4;
                    break;
                case FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + "\tEmp Hr: " + empHrs);
        }
        return totalEmpHrs * companyEmpWage.WAGE_PER_HR;
    }
}