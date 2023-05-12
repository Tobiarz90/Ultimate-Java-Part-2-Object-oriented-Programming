package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);

        // Without setting fields, the object will be in an invalid state. => use a constructor
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
