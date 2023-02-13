package com.employeewageproblem;
/*Program to Compute total wage for each employee*/
public class EmployeeWageComputation {
    static final int PART_TIME = 1;                // class constant
    static final int FULL_TIME = 2;
    final String COMPANY_NAME;                    // instance constant
    final int WAGE_PER_HOUR;
    final int MAX_WORKING_DAYS;
    final int MAX_WORKING_HOURS;
    int totalWage;                                // instance variable
    /*Creating constructor of the same class*/
    public EmployeeWageComputation(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours)
    {
        COMPANY_NAME = companyName;
        WAGE_PER_HOUR = wagePerHour;
        MAX_WORKING_DAYS = maxWorkingDays;
        MAX_WORKING_HOURS = maxWorkingHours;
    }
    public int workHours(int employeeType)                //It will return the working hours
    {
        switch (employeeType)
        {
            case FULL_TIME:
                return 8;
            case PART_TIME:
                return 4;
            default:
                return 0;
        }
    }
    void calculateTotalWage()                         //Calculating and storing the total wage for the month
    {
        System.out.println("Computation of total wage of " + COMPANY_NAME + " employee");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Working hours", "Wage", "Total working hrs");
        int workingHours;
        for (int day = 1, totalWorkingHours = 0; day <= MAX_WORKING_DAYS
                && totalWorkingHours <= MAX_WORKING_HOURS; day++, totalWorkingHours += workingHours)
        {
            int empCheck = (int) (Math.random() * 100) % 3;
            workingHours = workHours(empCheck);
            int wage = workingHours * WAGE_PER_HOUR;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHours, wage, totalWorkingHours + workingHours);
        }
    }
    public String toString()
    {
        System.out.println("Details of " + COMPANY_NAME + " employee");
        System.out.println("-----------------------------------------------------");
        System.out.println("Wage per hour:" + WAGE_PER_HOUR);
        System.out.println("Maximum working days in a month:" + MAX_WORKING_DAYS);
        System.out.println("Maximum working hours in a month:" + MAX_WORKING_HOURS);
        return "Total wage in a month for " + COMPANY_NAME + " employee is " + totalWage + "\n";
    }
    public static void main(String []args)
    {
        EmployeeWageComputation flipkart = new EmployeeWageComputation("Flipkart", 4, 20, 115);
        EmployeeWageComputation wipro = new EmployeeWageComputation("Wipro", 8, 30, 130);
        flipkart.calculateTotalWage();
        System.out.println(flipkart);
        wipro.calculateTotalWage();
        System.out.println(wipro);
    }
}