package org.example;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String departmentName;
    private Employee teamLead;
    private List<Employee> employeeList;
    private List<String> taskList;

    public Department(String departmentName, Employee teamLead) {
        this.departmentName = departmentName;
        this.teamLead = teamLead;
        this.employeeList = new ArrayList<>();
        this.taskList = new ArrayList<>();
    }

    public String getDepartmentName(){
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee getTeamLead(){
        return teamLead;
    }

    public void setTeamLead(Employee teamLead) {
        this.teamLead = teamLead;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public void printEmployeeList() {
        System.out.println("Personel Listesi:");
        for (Employee employee : employeeList) {
            employee.printInfo();
        }
    }

    public void addTask(String task) {
        taskList.add(task);
    }

    public void markTaskDone(String task) {
        if (taskList.contains(task)) {
            taskList.remove(task);
            System.out.println("Görev tamamlandı: " + task);
        } else {
            System.out.println("Görev bulunamadı: " + task);
        }
    }

    public void printTaskList() {
        System.out.println("Görev Listesi:");
        for (String task : taskList) {
            System.out.println("- " + task);
        }
    }
}