package com.bartosztobiasz;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    // Use an existing logic for constructor overloading.
    public Employee(int baseSalary) {
        this(baseSalary, 0); // call a constructor using 'this' keyword
    }

//    public Employee(int baseSalary) {
//        setBaseSalary(baseSalary);
//        setHourlyRate(0);
//    }

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    // Use an existing logic for method overloading.
    public int calculateWage() {
        return calculateWage(0);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be negative.");
        this.hourlyRate = hourlyRate;
    }
}
