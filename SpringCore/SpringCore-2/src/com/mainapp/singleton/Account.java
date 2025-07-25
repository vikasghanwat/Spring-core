package com.mainapp.singleton;

public class Account {
    private int accNo;
    private String name;
    private String type;
    private String address;

    @Override
    public String toString() {
        return "Account{" + "accNo=" + accNo + ", name='" + name + '\'' + ", type='" + type + '\'' + ", address='" + address + '\'' + '}';
    }

    public Account() {
        System.out.println("Account bean instantiation");
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
