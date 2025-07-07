package com.mainapp;

import java.util.List;

public class Employee {

    private int eId;
    private String ename;

    List<String> defaultListBooks;

    public Employee() {
    }

    /*  to inject list from constructor it mandatory to have constructor with the attribute which
    we want to inject from constructor DI*/
    public Employee(List<String> defaultListBooks) {
        this.defaultListBooks = defaultListBooks;
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

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", ename='" + ename + '\'' +
                ", listOfCourses=" + defaultListBooks +
                '}';
    }
}

