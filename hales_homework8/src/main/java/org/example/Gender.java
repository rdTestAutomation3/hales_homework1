package org.example;

public enum Gender {
    KADIN(60),
    ERKEK(65);

    private final int retirementAge;

    Gender(int retirementAge) {
        this.retirementAge = retirementAge;
    }

    public int getRetirementAge() {
        return retirementAge;
    }
}
