package com;

import com.deepclone.CompanyDeep;
import com.deepclone.EmployeeDeep;


public class TestEmployeeDeep {
    public static void main(String[] args) throws CloneNotSupportedException  {
        EmployeeDeep employeeDeep1 = new EmployeeDeep("Aleksey", 35,
                new CompanyDeep("company1","moscow"));
        EmployeeDeep emplyoeeDeepClone = employeeDeep1.clone();
        System.out.println("Origin:\t" + employeeDeep1);
        System.out.println("Clone: \t" + emplyoeeDeepClone);

        CompanyDeep companyCloneEmployeeDeep = emplyoeeDeepClone.getCompany();
        companyCloneEmployeeDeep.setNameCompany("Cloned Company1");

        System.out.println("-------------------------------------");

        System.out.println("Origin:\t" + employeeDeep1);
        System.out.println("Clone: \t" + emplyoeeDeepClone);

        System.out.println("---------with constructor of copy--------------");
        EmployeeDeep employeeDeep2 = new EmployeeDeep(employeeDeep1);
        System.out.println("Origin:\t" + employeeDeep1);
        System.out.println("Clone: \t" + employeeDeep2);

    }
}
