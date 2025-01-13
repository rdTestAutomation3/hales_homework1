package org.example;

public class AccountingDepartmentTest {
    public static void main(String[] args) {
        //Çalışan tanımlama
        AccountingDepartment employee = new AccountingDepartment("Kenan Yılmaz");

        //Çalışma gün sayısını belirleme. Örnek olarak 30 gün çalışma verelim.
        int daysWorked = 30;

        //Maaş bilgilerini yazdırmak için
        employee.printSalaryInfo(daysWorked);
    }
}
