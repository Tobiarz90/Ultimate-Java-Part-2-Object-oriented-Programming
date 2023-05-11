package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(); // coupling point #1

        employee.setBaseSalary(50_000); // coupling point #2
        employee.setHourlyRate(20); // coupling point #3

        int wage = employee.calculateWage(10); // coupling point #4
        System.out.println(wage);
    }
}
