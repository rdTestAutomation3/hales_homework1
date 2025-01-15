package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;

    public Employee(String name, String lastName, LocalDate birthDate, Gender gender) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getLastName() {
        return lastName;
    }

    public void getLastName(String lastName){
        this.lastName=lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate=birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender){
        this.gender=gender;
    }

    public int calculateRetirement() {
        int retirementAge = gender.getRetirementAge();
        int age = Period.between(birthDate, LocalDate.now()).getYears();
        return retirementAge - age;
    }

    public void printInfo(){
        System.out.println("Ad: " + name + ", Soyad: " + lastName + ", Cinsiyet: " + gender +
                ", Emekliliğe Kalan Yıl: " + calculateRetirement());
    }
}
