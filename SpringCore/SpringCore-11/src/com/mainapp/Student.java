package com.mainapp;

public class Student {

    //IOC
    private String countryCode;
    private String countryName;
    private String continental;

    //user
    private int sId;
    private String sname;

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

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", continatal='" + continental + '\'' +
                ", sId=" + sId +
                ", sname='" + sname + '\'' +
                '}';
    }
}
