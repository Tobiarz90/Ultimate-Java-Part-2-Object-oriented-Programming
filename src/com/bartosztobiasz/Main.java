package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var report = new TaxReport();

        var calculator = new TaxCalculator2023(100_000); // dependency
        report.show(calculator);

        report.show(new TaxCalculator2024());
    }
}
