package com.mainapp;

public class Account {

    private int accountNo;
    private String accountType;

    public Account() {
    }

    public Account(int accountNo, String accountType) {
        this.accountNo = accountNo;
        this.accountType = accountType;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
