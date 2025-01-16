package org.example;

public class HesapMakinesiTest {

    public static void main(String[] args) {
        HesapMakinesiTest test = new HesapMakinesiTest();

        test.testBolmeIslemi_SifiraBolunme();
        test.testBolmeIslemi_DogruSonuc();
    }

    public void testBolmeIslemi_SifiraBolunme() {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        try {
            //örnek olarak 4'ü 0'a bölmeye çalışıyoruz
            hesapMakinesi.bolmeIslemi(4, 0);
            System.out.println("FAILED: Sıfıra bölünme hatası atılmadı");
        } catch (SifiraBolunmeException e) {
            // Hata bekleniyor ve mesajın doğru olması kontrol ediliyor
            if (e.getMessage().equals("Sıfıra bölme işlemi hatası!")) {
                System.out.println("PASSED");
            } else {
                System.out.println("FAILED - Yanlış hata mesajı");
            }
        }
    }

    public void testBolmeIslemi_DogruSonuc() {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        try {
            //örnek olarak 20'yi 5'e böldüğümüzde 4 bekliyoruz
            double sonuc = hesapMakinesi.bolmeIslemi(20, 5);
            if (Math.abs(sonuc - 4.0) < 0.0001) {
                System.out.println("PASSED");
            } else {
                System.out.println("FAILED - Beklenen sonuç 4.0, ama " + sonuc + " döndü");
            }
        } catch (SifiraBolunmeException e) {
            System.out.println("FAILED - Beklenmeyen bir hata: " + e.getMessage());
        }
    }
}
