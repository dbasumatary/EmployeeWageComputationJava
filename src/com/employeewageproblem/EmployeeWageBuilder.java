package com.employeewageproblem;
/*Using interface to compute employee wage*/
public interface EmployeeWageBuilder {
    public int computeEmpWage(CompanyEmpWage companyEmpWage);
    public void addCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours);
    public void computeEmpWage();
    }
