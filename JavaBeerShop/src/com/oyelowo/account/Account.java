package com.oyelowo.account;

public class Account {
    protected double balance, credits, debits;

    public Account(){ }

    public Account(double balance, double credits,double debits) {
        this.balance = balance;
        this.credits = credits;
        this.debits = debits;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public double getDebits() {
        return debits;
    }

    public void setDebits(double debits) {
        this.debits = debits;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", credits=" + credits +
                ", debits=" + debits +
                '}';
    }
}
