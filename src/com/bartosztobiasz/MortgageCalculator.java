package com.bartosztobiasz;

// calculations class
public class MortgageCalculator {
    private final int principal;
    private final float annualInterest;
    private final byte years;

    /*
    calculateBalance() and calculateMortgage() are using the same set of parameters:
    int principal, float annualInterest, byte years

    You should store them inside the fields of a class -> encapsulation
    and initialize them in a constructor.
     */
    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateMortgage() {
        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        float numberOfPayments = years * Main.MONTHS_IN_YEAR;

        return principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public double calculateBalance(
            short numberOfPaymentsMade
    ) {
        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        float numberOfPayments = years * Main.MONTHS_IN_YEAR;

        return principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public byte getYears() {
        return years;
    }
}