package org.example;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args){
        //Kadın ve Erkek Personel Nesneleri
        Employee female = new Employee("Ayşe", "Çelik", LocalDate.of(1980, 4, 14), Gender.KADIN);
        Employee male = new Employee("Ahmet", "Usta", LocalDate.of(1979, 5, 20), Gender.ERKEK);

        //Emeklilik hesaplama
        System.out.println(female.getName() + " emekliliğine kalan yıl: " + female.calculateRetirement());
        System.out.println(male.getName() + " emekliliğine kalan yıl: " + male.calculateRetirement());

        //Departman oluşturma
        Department department = new Department("HR", female);
        department.addEmployee(female);
        department.addTask("İşe alım");
        department.markTaskDone("İşe alım");
    }
}
