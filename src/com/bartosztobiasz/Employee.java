package com.bartosztobiasz;

// Single unit:
public class Employee {
    // Data:
    public int baseSalary;
    public int hourlyRate;
//    public int extraHours; // changes every month

    // Methods:
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
