package org.example;

public class AccountingDepartment {
    private String employeeName;
    private static final int dailyWage = 867;       //Günlük asgari ücret (TL)
    private static final int extraPerDay = 1735;    //Fazla gün başına prim (TL)

    public AccountingDepartment(String employeeName){
        this.employeeName=employeeName;
    }

    public int salaryCalculation(int daysWorked) {
        //Maaş hesaplama
        int baseSalary = daysWorked * dailyWage;

        //Prim hesaplama
        int extra = daysWorked > 25 ? (daysWorked - 25) * extraPerDay : 0;

        //Toplam maaş
        return baseSalary + extra;
    }

    public void printSalaryInfo(int daysWorked){
        int totalSalary=salaryCalculation(daysWorked);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Days Worked: " + daysWorked);
        System.out.println("Total Salary: " + totalSalary + " TL ");
    }
}
