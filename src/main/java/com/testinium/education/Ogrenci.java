package com.testinium.education;

import java.util.ArrayList;
import java.util.Scanner;

public class Ogrenci {
    private String ad;
    private String soyad;
    private Okul okul;

    public Ogrenci() {
    }

    public Ogrenci(String ad, String soyad, Okul okul) {
        this.ad = ad;
        this.soyad = soyad;
        this.okul = okul;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Okul getOkul() {
        return okul;
    }

    public void setOkul(Okul okul) {
        this.okul = okul;
    }

    int topla(int a, int b) {
        return a + b;
    }

    int topla(int a, int b, int c) {
        return a + b + c;
    }

    public static void topla(int... deger) {
        int toplam = 0;
        for (int i : deger) {
            toplam += i;
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();


        Ogrenci ogr = new Ogrenci();
        ogr.setAd("Mehmet");
        ogr.setSoyad("Akşahin");//ogr.soyad = "Akşahin";
        ogr.okul = new Okul();
        ogr.okul.ogrenciSayisi = 5;
        ogr.okul.okulAdi = "Üniversite";
        Ogrenci ogr2 = new Ogrenci("ebubekir", "durukal", new Okul());

        Egitici e = new Egitici();
        e.ad = "Ahmet";
        e.soyad = "Durukal";
        System.out.println(e.toString());

        //Ogrenci ogr2 = ogr;
        ogr.ad = "Ali";
        System.out.println(ogr2.ad);

        ogr.topla(3, 5, 5);
        topla(1, 2, 3, 4, 5, 6, 7);
    }


}


