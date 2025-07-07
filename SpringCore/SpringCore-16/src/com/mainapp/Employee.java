package com.mainapp;

import java.util.List;

public class Employee {

    //User
    private int eId;
    private String ename;

    //IOC
    List<String> defaultListBooks;
    private Account account;
    private Adhaar adhaar;

    public Employee() {
    }

    public Employee(List<String> defaultListBooks, Account account, Adhaar adhaar) {
        System.out.println("Autowiring dependencies injecting from constructor");
        this.defaultListBooks = defaultListBooks;
        this.account = account;
        this.adhaar = adhaar;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", ename='" + ename + '\'' +
                ", defaultListBooks=" + defaultListBooks +
                ", account=" + account +
                ", adhaar=" + adhaar +
                '}';
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public List<String> getDefaultListBooks() {
        return defaultListBooks;
    }

    public void setDefaultListBooks(List<String> defaultListBooks) {
        this.defaultListBooks = defaultListBooks;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Adhaar getAdhaar() {
        return adhaar;
    }

    public void setAdhaar(Adhaar adhaar) {
        this.adhaar = adhaar;
    }
}

