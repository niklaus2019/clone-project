package com.deepclone;

public class EmployeeDeep implements Cloneable{
    private String name;
    private int age;
    private CompanyDeep company;

    public EmployeeDeep(String name, int age, CompanyDeep company){
        this.name = name;
        this.age = age;
        this.company = company;
    }

    public EmployeeDeep (EmployeeDeep otherEmployee) throws CloneNotSupportedException {
        this(otherEmployee.getName(), otherEmployee.getAge(), otherEmployee.getCompany().clone());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CompanyDeep getCompany() {
        return company;
    }

    public void setCompany(CompanyDeep company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", company=" + company +
                '}';
    }

    public EmployeeDeep clone() throws CloneNotSupportedException {
        EmployeeDeep newEmployeeDeep = (EmployeeDeep) super.clone();
        CompanyDeep company = this.getCompany().clone();
        newEmployeeDeep.setCompany(company);
        return newEmployeeDeep;
    }
}