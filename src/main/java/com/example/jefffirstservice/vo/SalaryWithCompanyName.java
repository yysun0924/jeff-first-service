package com.example.jefffirstservice.vo;

public class SalaryWithCompanyName {
    private int minSalary;
    private int maxSalary;

    private String company;

    public SalaryWithCompanyName() {}

    public SalaryWithCompanyName(int minSalary, int maxSalary, String company) {
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
        this.company = company;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String toString() {
        return "my salary is between " + this.minSalary + " and " + this. maxSalary + " in company-" + this.company;
    }
}
