package com.oyelowo.company;

import com.oyelowo.account.Account;
import com.oyelowo.customer.Customer;
import com.oyelowo.worker.Worker;

public class Company extends CompanyAccount{
    // private double balance = 10000;
    private Worker worker;
    private Customer customer;
    private final String name = "oyelowoCompany";
    private final String authorizationKey = "oyelowo";
    // private Account companyAccount = new Account(this.balance, 0, 0);

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAuthorizationKey() {
        return authorizationKey;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private void reduceBalance(Double amountToBePaid){
        Double newCompanyBalance = this.balance - amountToBePaid;
        setBalance(newCompanyBalance);
    }

    private void reduceDebit(Double amountToBePaid){
        this.debits = this.debits - amountToBePaid;
    }

    private void payWorker (double amountToBePaid, Worker worker){
        double newAmountForWorker = worker.getBalance(this) + amountToBePaid;
        worker.setBalance(newAmountForWorker,  this);
    }

    public void paySalary(double amountToBePaid, Worker worker){
        payWorker(amountToBePaid, worker);
        reduceBalance(amountToBePaid);
        reduceDebit(amountToBePaid);
    }
}
