package com.bartosztobiasz;

// Single unit:
public class Employee {
    // Data:
    private int baseSalary;
    private int hourlyRate;

    // Methods:
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    // unnecessary detail -> delete it -> reduce coupling
//    public int getBaseSalary() {
//        return baseSalary;
//    }

    // setter
    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    // unnecessary detail -> delete it -> reduce coupling
//    public int getHourlyRate() {
//        return hourlyRate;
//    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative.");
        this.hourlyRate = hourlyRate;
    }
}
