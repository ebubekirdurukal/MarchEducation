package com.testinium.education;


/**
 * author:Ebubekir Durukal
 */
public class Calculator {

    private int sayi1;
    private int sayi2;

    public Calculator() {
    }

    //Construtor
    public Calculator(int sayi1, int sayi2) {
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;
    }

    public int getSayi1() {
        return sayi1;
    }

    public void setSayi1(int sayi1) {
        this.sayi1 = sayi1;
    }

    public int getSayi2() {
        return sayi2;
    }

    public void setSayi2(int sayi2) {
        this.sayi2 = sayi2;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "sayi1=" + sayi1 +
                ", sayi2=" + sayi2 +
                '}';
    }

    public int topla(){
        System.out.println(this.sayi1 + this.sayi2);
        return this.sayi1 + this.sayi2;
    }

    public void yazdir(){
        System.out.println(topla());
    }




}
