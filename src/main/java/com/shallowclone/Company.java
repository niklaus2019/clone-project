package com.shallowclone;

public class Company implements Cloneable{
    private String nameCompany;
    private String address;

    public Company(String nameCompany, String address) {
        this.nameCompany = nameCompany;
        this.address = address;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "nameCompany='" + nameCompany + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Company clone() throws CloneNotSupportedException {
        return (Company) super.clone();
    }
}