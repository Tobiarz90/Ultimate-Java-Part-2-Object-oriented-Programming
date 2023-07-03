package com.bartosztobiasz;

public class TaxReport {
    // TaxReport class is tightly coupled to TaxCalculator class
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        calculator = new TaxCalculator(100_000);
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
