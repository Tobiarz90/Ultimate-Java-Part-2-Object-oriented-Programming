package com.bartosztobiasz;

public class TaxCalculator2023 implements TaxCalculator {
    private final double taxableIncome;

    public TaxCalculator2023(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
