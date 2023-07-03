package com.bartosztobiasz;

public class TaxReport {
    // TaxReport class is tightly coupled to TaxCalculator class
    private TaxCalculator2023 calculator;

    public TaxReport(TaxCalculator2023 calculator) {
        // The class shouldn't instantiate its dependency!
        calculator = new TaxCalculator2023(100_000);
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
