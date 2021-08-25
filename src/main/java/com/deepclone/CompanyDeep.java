package com.deepclone;

public class CompanyDeep implements Cloneable{
    private String nameCompany;
    private String address;

    public CompanyDeep(String nameCompany, String address) {
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

    public CompanyDeep clone() throws CloneNotSupportedException {
        return (CompanyDeep) super.clone();
    }
}