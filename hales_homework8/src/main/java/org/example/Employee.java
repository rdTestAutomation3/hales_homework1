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

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public int calculateRetirement() {

        int retirementAge = gender.getRetirementAge();
        int age = Period.between(birthDate, LocalDate.now()).getYears();
        return retirementAge - age;
    }

}
