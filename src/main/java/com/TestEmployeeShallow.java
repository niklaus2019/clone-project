package com;

import com.shallowclone.Company;
import com.shallowclone.Employee;

public class TestEmployeeShallow {
        public static void main(String[] args) throws CloneNotSupportedException {
                Employee employee1 = new Employee("Aleksey", 35,
                        new Company("company1","moscow"));
                Employee emploeeClone = employee1.clone();

                System.out.println("-------shallow cloning------");
                System.out.println("Origin:\t" + employee1);
                System.out.println("Clone:   \t" + emploeeClone);

                Company companyCloneEmployee = emploeeClone.getCompany();
                companyCloneEmployee.setNameCompany("Cloned Company1");

                System.out.println("-------After setting the new company name-------------");

                System.out.println("Origin:\t" + employee1);
                System.out.println("Clone:   \t" + emploeeClone);

                System.out.println("-------------------------------------");
                System.out.println("---------with constructor of copy-------------------");
                Employee employee2 = new Employee(employee1);
                System.out.println("Origin:\t" + employee1);
                System.out.println("Clone:   \t" + employee2);

        }
}