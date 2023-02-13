package com.employeewageproblem;
/*Program to manage employee wage of multiple companies*/
public class EmployeeWageComputation implements EmployeeWageBuilder{
    public static final int PART_TIME = 1;          // class constant
    public static final int FULL_TIME = 2;
    int companies = 0;                        // instance variables
    private CompanyEmpWage[] companyArray;
    public EmployeeWageComputation(int n) {                  //Constructor of same class
        companyArray = new CompanyEmpWage[n];
    }
    public void addCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        companyArray[companies] = new CompanyEmpWage(companyName, wagePerHour, maxWorkingDays, maxWorkingHours);
        companies++;
    }
    public void computeEmpWage() {
        for (int i = 0; i < companies; i++) {
            companyArray[i].setTotalEmployeeWage(this.computeEmpWage(companyArray[i]));
            System.out.println(companyArray[i]);
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