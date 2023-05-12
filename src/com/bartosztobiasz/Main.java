package com.bartosztobiasz;

public class Main {
    // The main method is static, enabling the JRE to directly call this method without creating an object.
    public static void main(String[] args) {
        var employee = new Employee(50_000);

        System.out.println(Employee.numberOfEmployees);
        Employee.printNumberOfEmployees(); // static method

        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}
