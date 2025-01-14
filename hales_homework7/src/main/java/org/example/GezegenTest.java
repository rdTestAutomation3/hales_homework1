package org.example;

public class GezegenTest {
    public static void main(String[] args) {
        for (Gezegen gezegen : Gezegen.values()) {
            System.out.println("Gezegen: " + gezegen.name());
            System.out.println("Sıralama: " + gezegen.getSiralama());
            System.out.println("Güneş'e Uzaklık: " + gezegen.getUzaklik() + " milyon km");
            System.out.println("Yarıçap: " + gezegen.getYaricap() + " km");
            System.out.println("Dönme Süresi: " + gezegen.getDonmeSuresi() + " dünya günü");
            System.out.println("----------------------------");
        }
    }
}
