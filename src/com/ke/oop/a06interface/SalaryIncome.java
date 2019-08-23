package com.ke.oop.a06interface;

public class SalaryIncome implements Income {

	// TODO
    private double income;

    public SalaryIncome(double income) {
        this.income = income;
    }

    @Override
    public double getTax() {
        return income * 0.1;
    }
}
