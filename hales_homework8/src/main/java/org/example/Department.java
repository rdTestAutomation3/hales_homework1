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

    public void setTeamLead(Employee teamLead) {
        this.teamLead = teamLead;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public void updateEmployee(int index, Employee newEmployee) {
        employeeList.set(index, newEmployee);
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
}
