package com.javarush.test.level14.lesson08.home09;

public abstract class Money
{
    private double amon;

    public Money(double amount)
    {
        this.amon = amount;
    }

    public double getAmount(){

        return amon;
    }


    public abstract String getCurrencyName();
}

