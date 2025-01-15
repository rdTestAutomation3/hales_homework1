package org.example;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args){
        //Kadın ve Erkek Personel Nesneleri
        Employee female = new Employee("Ayşe", "Çelik", LocalDate.of(1980, 4, 14), Gender.KADIN);
        Employee male = new Employee("Ahmet", "Usta", LocalDate.of(1979, 5, 20), Gender.ERKEK);
        Employee lead = new Employee("Aysel", "Çelmez", LocalDate.of(1970, 1, 4), Gender.KADIN);

        Department hrDepartment = new Department("HR", lead);

        hrDepartment.addEmployee(female);

        hrDepartment.addTask("İşe alım");
        hrDepartment.printTaskList();
        hrDepartment.markTaskDone("İşe alım");

        hrDepartment.printEmployeeList();
    }
}
