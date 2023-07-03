package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2023(100_000); // dependency
        var report = new TaxReport(calculator); // (concrete implementation)
        report.show();

        /*
        Benefit of setter injection:
        implementation of dependency can be changed throughout the lifetime of a program
         */
        report.setCalculator(new TaxCalculator2024()); // setter(concrete implementation)
        report.show();
    }
}
