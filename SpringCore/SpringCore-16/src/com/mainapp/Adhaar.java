package com.mainapp;

public class Adhaar {

    private int adharNo;
    private String adharName;

    public int getAdharNo() {
        return adharNo;
    }

    public void setAdharNo(int adharNo) {
        this.adharNo = adharNo;
    }

    public String getAdharName() {
        return adharName;
    }

    public void setAdharName(String adharName) {
        this.adharName = adharName;
    }

    public Adhaar(int adharNo, String adharName) {
        this.adharNo = adharNo;
        this.adharName = adharName;
    }

    public Adhaar() {
    }

    @Override
    public String toString() {
        return "Adhaar{" +
                "adharNo=" + adharNo +
                ", adharName=" + adharName +
                '}';
    }
}
