package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee();

        // A setter prevents an object from being in an invalid state.
//        employee.setBaseSalary(-1);

        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);

        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
