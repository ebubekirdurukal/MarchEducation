package com.testinium.education;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
        int[] dizi = new int[3];
        dizi[0] = 0;
        dizi[1] = 1;
        dizi[2] = 2;
        System.out.println(dizi.length);

        int[] dizi2 = {1, 2, 3};

        Ogrenci ogr1 = new Ogrenci("ebubekir", "durukal", new Okul());
        Ogrenci ogr2 = new Ogrenci("ahmet", "durukal", new Okul());
        Ogrenci ogr3 = new Ogrenci("mehmet", "durukal", new Okul());


        Ogrenci[] ogrenciList = new Ogrenci[3];
        ogrenciList[0] = ogr1;
        ogrenciList[1] = ogr2;
        ogrenciList[2] = ogr3;

        for (int i = 0; i < ogrenciList.length; i++) {
            System.out.println(ogrenciList[i]);
        }

        int[][] buyukDizi = new int[20][5];
        buyukDizi[3][4] = 4;

        int[][][][] matris = new int[2][2][2][2];

        List list = new ArrayList<>();
        list.add("ahmet");
        list.add("mehmet");
        list.add("ali");
        list.add("ali");
        list.add("veli");
        System.out.println(list);

        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(new Integer(1), "isim");
        hash.put(new Integer(2), "isim");
        hash.put(new Integer(3), "isim");


    }


}
