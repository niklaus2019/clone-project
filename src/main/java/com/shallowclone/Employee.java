package com.shallowclone;

public class Employee implements Cloneable{
    private String name;
    private int age;
    private Company company;

    public Employee(String name, int age, Company company){
        this.name = name;
        this.age = age;
        this.company = company;
    }
    public Employee(Employee otherEmployee) {
        //constructor with other parameters
        this(otherEmployee.getName(), otherEmployee.getAge(), otherEmployee.getCompany());
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
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

    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}