package com.mainapp;

public class Employee {

    //IOC
    private String countryCode;
    private String countryName;
    private String continental;

    //user
    private int eId;
    private String ename;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinental() {
        return continental;
    }

    public void setContinental(String continental) {
        this.continental = continental;
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

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", continatal='" + continental + '\'' +
                ", eId=" + eId +
                ", ename='" + ename + '\'' +
                '}';
    }
}

