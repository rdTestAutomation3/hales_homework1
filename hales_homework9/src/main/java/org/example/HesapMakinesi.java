package org.example;

public class HesapMakinesi {

    public double bolmeIslemi(double bolunen, double bolen) throws SifiraBolunmeException {
        if (bolen == 0) {
            throw new SifiraBolunmeException("Sıfıra bölme işlemi hatası!");
        }
        return bolunen / bolen;
    }
}
