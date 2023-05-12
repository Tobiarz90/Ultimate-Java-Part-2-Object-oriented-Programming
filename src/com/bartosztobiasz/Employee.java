package com.bartosztobiasz;

// Single unit:
public class Employee {
    // Data:
    private int baseSalary; // default value set by a default constructor: 0
    private int hourlyRate; // default value set by a default constructor: 0

    /*
    Constructor -> special method called when creating a new object:
    the job of default constructor is to initialize fields to their default values
     */
    public Employee(int baseSalary, int hourlyRate) {
//        this.baseSalary = baseSalary;
        setBaseSalary(baseSalary); // use setters for data validation

//        this.hourlyRate = hourlyRate;
        setHourlyRate(hourlyRate); // use setters for data validation
    }

    // Methods:
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    // apply abstraction principle -> make methods private
    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    // apply abstraction principle -> make methods private
    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative.");
        this.hourlyRate = hourlyRate;
    }
}
