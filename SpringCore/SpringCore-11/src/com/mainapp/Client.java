package com.mainapp;

public class Client {

    //IOC
    private String countryCode;
    private String countryName;
    private String continental;

    //user
    private int cId;
    private String cName;

    public Client() {
    }

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

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Client{" +
                "countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", continental='" + continental + '\'' +
                ", cId=" + cId +
                ", cName='" + cName + '\'' +
                '}';
    }
}
