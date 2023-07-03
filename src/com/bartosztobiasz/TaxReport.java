package com.bartosztobiasz;

public class TaxReport {
    private TaxCalculator calculator;

    // Constructor injection
    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    // Setter injection
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
