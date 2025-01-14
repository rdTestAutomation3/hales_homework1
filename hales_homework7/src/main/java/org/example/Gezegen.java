package org.example;

public enum Gezegen {

    MERKÜR(1, 57.9, 2439.7, 58.6),
    VENÜS(2, 108.2, 6051.8, 243.0),
    DÜNYA(3, 149.6, 6371.0, 1.0),
    MARS(4, 227.9, 3389.5, 1.03),
    JÜPİTER(5, 778.5, 69911.0, 0.41),
    SATÜRN(6, 1433.5, 58232.0, 0.45),
    URANÜS(7, 2872.5, 25362.0, 0.72),
    NEPTÜN(8, 4495.1, 24622.0, 0.67);

    private final int siralama;         //Güneş'e yakınlığa göre sıralama numarası
    private final double uzaklik;       //Güneş'e uzaklık
    private final double yaricap;       //Yarıçap
    private final double donmeSuresi;   //Dönme süresi

    //Constructor
    Gezegen(int siralama, double uzaklik, double yaricap, double donmeSuresi) {
        this.siralama = siralama;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    public int getSiralama() {
        return siralama;
    }

    public double getUzaklik() {
        return uzaklik;
    }

    public double getYaricap() {
        return yaricap;
    }

    public double getDonmeSuresi() {
        return donmeSuresi;
    }
}