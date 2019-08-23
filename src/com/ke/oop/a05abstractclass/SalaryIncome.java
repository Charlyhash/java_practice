package com.ke.oop.a05abstractclass;

public class SalaryIncome extends Income{

    public SalaryIncome(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return income * 0.1;
    }
}
