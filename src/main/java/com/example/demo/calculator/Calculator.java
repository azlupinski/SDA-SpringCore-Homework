package com.example.demo.calculator;

import com.example.demo.cash.Currency;

public class Calculator {



    private Currency firstCurrency;

    private double amount;

    public Calculator() {
    }

    public Calculator(Currency firstCurrency, Currency secondCurrency, double amount) {
        this.firstCurrency = firstCurrency;
        this.amount = amount;
    }

    public double calculate(Currency secondCurrency){
           double result = this.firstCurrency.getValue()/secondCurrency.getValue()*amount;
        return result;

    }

    public Currency getFirstCurrency() {
        return firstCurrency;
    }

    public void setFirstCurrency(Currency firstCurrency) {
        this.firstCurrency = firstCurrency;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "firstCurrency=" + firstCurrency +
                '}';
    }
}
