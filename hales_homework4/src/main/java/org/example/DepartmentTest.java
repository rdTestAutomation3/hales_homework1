package org.example;

public class DepartmentTest {
    public static void main(String[] args){
        Department hrDepartment = new Department("HR Department");
        Department beDepartment = new Department("Backend Department");
        Department feDepartment = new Department("Frontend Department");

        hrDepartment.addEmployee("Ahmet");
        beDepartment.addEmployee("Fatma");
        feDepartment.addEmployee("Mehmet");

        hrDepartment.printDepartmentInfo();
        beDepartment.printDepartmentInfo();
        feDepartment.printDepartmentInfo();
    }
}