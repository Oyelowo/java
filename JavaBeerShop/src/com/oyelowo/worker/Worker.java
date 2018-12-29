package com.oyelowo.worker;

import com.oyelowo.account.Account;
import com.oyelowo.company.Company;

public abstract class Worker{
    protected Account acc;
    protected Double balance;
    protected String name;
    protected String team;
    protected Integer payLevel;
    public static final String myCompany = "oyelowoCompany";

    public Worker(){};

    /*public Worker(Double balance){
        this.balance = balance;
    }*/

    public Worker(Double balance){
        this("", "",null, balance);
        System.out.println("object with only balance instantiated");
    };
    public Worker(String name, String team, Integer payLevel, Double balance) {
        this.name = name;
        this.team = team;
        this.payLevel = payLevel;
        this.balance = balance;
    }

    public Account getAcc() {
        return acc;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getPayLevel() {
        return payLevel;
    }

    public void setPayLevel(Integer payLevel) {
        this.payLevel = payLevel;
    }

    public static String getMyCompany() {
        return myCompany;
    }


    public Double getBalance(Company myCompany) {
        if (myCompany.getName() == "oyelowoCompany" && myCompany.getAuthorizationKey() == "oyelowo") {
            return balance;
        }
        return null;
    }

    public void setBalance(Double balance, Company myCompany) {
        if (this.myCompany == myCompany.getName() && myCompany.getAuthorizationKey() == "oyelowo"){
            this.balance = balance;
        }
    }

    public Account geAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }
}
