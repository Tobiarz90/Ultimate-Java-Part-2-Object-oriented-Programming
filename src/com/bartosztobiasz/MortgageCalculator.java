package com.bartosztobiasz;

// calculations class
public class MortgageCalculator {
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;
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
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        return principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public double calculateBalance(
            short numberOfPaymentsMade
    ) {
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        return principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public double[] getRemainingBalances() {
        double[] balances = new double[getNumberOfPayments()];

        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = calculateBalance(month);

        return balances;
    }

    /*
    duplicated logic (calculateBalance and calculateMortgage)

    (N) Promote this local variables as private fields in this class,
    and initialize them in the constructor.
    (Y) Extract this expression as a private method in this class.

    Choose (Y) to prevent recalculating monthly interest
    whenever you change the annual interest rate (`setAnnualInterest()`).
     */
    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }
}