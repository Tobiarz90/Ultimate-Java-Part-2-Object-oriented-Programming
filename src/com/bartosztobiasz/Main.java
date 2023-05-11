package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        // Procedural paradigm is based on procedure/function cost

        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);
    }

    // procedure
    public static int calculateWage(
            // a lot of parameters
            int baseSalary,
            int extraHours,
            int hourlyRate
    ) {
        return baseSalary + (extraHours * hourlyRate);
    }
}
