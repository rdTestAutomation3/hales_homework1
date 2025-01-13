package org.example;

import java.util.ArrayList;
import java.util.List;

public class Department {
    public String name;
    public List<String> employees;

    public Department(String name){
        this.name=name;
        this.employees= new ArrayList<>();
    }

    public void addEmployee(String employeeName){
        employees.add(employeeName);
    }

    public List<String> getEmployees(){
        return employees;
    }

    public void printDepartmentInfo(){
        System.out.println("Department: " + name);
        System.out.println("Employees: ");
        for(String employee : employees){
            System.out.println(" - " + employee);
        }
    }
}
