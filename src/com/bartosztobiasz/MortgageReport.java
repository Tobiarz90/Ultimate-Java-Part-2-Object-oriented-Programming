package com.bartosztobiasz;

import java.text.NumberFormat;

// presentation class
// this class manages all presentation concerns (printing)
public class MortgageReport {
    private final MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double remainingBalance : calculator.getRemainingBalances()) {
            System.out.println(NumberFormat.getCurrencyInstance().format(remainingBalance));
        }
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}