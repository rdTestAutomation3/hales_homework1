package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class TekrarliHarfler {
    //Verilen kelimelerde tekrar eden harf olup olmadığını kontrol etmek için.
    public static boolean tekrarliHarfVarMi(String kelime){
        HashSet<Character> harfSeti = new HashSet<>();
        for (char harf : kelime.toCharArray()){
            if (harfSeti.contains(harf)) {
                return true; //Tekrarlı harf varsa
            }
            harfSeti.add(harf);
        }
        return false; //Tekrarlı harf yoksa
    }

    //Tekrarlı harfleri bir defa alıp kelimeleri birleştirir
    public static String kelimeleriBirlestir(String kelime1, String kelime2) {
        StringBuilder yeniKelime = new StringBuilder();
        HashSet<Character> eklenenHarfler = new HashSet<>();

        //İlk kelimenin harflerini eklemek için
        for (char harf : kelime1.toCharArray()) {
            if (!eklenenHarfler.contains(harf)) {
                yeniKelime.append(harf);
                eklenenHarfler.add(harf);
            }
        }

        //İkinci kelimenin harflerini eklemek için
        for (char harf : kelime2.toCharArray()) {
            if (!eklenenHarfler.contains(harf)) {
                yeniKelime.append(harf);
                eklenenHarfler.add(harf);
            }
        }
        return yeniKelime.toString();
    }
    public static void main(String[] args){
        //Kelime dizisini oluşturmak için
        String[] kelimeDizisi={"kalem", "elalem", "kelam", "kelime"};
        ArrayList<String> tekrarliKelimeler=new ArrayList<>();

        //Kelimelerde tekrarlı harf olup olmadığını kontrol etmek için
        for(String kelime : kelimeDizisi){
            if(tekrarliHarfVarMi(kelime)){
                tekrarliKelimeler.add(kelime);
            }
            //2 kelime bulduğunda dur
            if(tekrarliKelimeler.size()==2){
                break;
            }
        }

        //2 kelime bulduysa harfleri 1 kere kullanarak birleştir
        if(tekrarliKelimeler.size()==2){
            String kelime1 = tekrarliKelimeler.get(0);
            String kelime2 = tekrarliKelimeler.get(1);

            //Tekrarlı harfleri bir kez kullanıp yeni kelime oluştur
            String yeniKelime = kelimeleriBirlestir(kelime1, kelime2);

            System.out.println("Tekrarlı harf içeren 2 kelime: " + kelime1 + " - " + kelime2);
            System.out.println("Oluşturulan kelime: " + yeniKelime);
        }else{
            System.out.println("Dizide tekrarlı harf içeren kelime yok");
        }
    }
}