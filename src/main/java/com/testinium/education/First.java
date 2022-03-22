package com.testinium.education;

public class First {


    /**
     * @param args Diğer açıklamalar
     * @author Ebubekir Durukal
     */
    public static void main(String[] args) {
        // bu bir tek satır yorumdur.
        /*
        bu
        bir
        çoklu satır yorumdur.
         */

//        System.out.println("Selam");
//
//        short sh = 1;
//        int i = 12;
//        char c = 'a';
//        boolean bool = true;
//        long l = 10L;
//        double d = 12.45;
//        float f = 3.14f;
//        int largeNumber = 100_000_000;
//        long lo = i;
//        i = (int) lo;
//        i = (int)lo;
//        String str = "OrnekString";
//        Integer integer = new Integer(3);
//        int _deger =3;
//        // int 5deger =3; yanlış atama
//        int $deger =3;
//        int _ = 6;
//
//        byte by = 0;
//        int in = 131;
//        by = (byte) in;
//        System.out.println(by);
//
//        int a = 3 + 5;
//        int b = 5;
//        int c = a + b;
//        System.out.println(c);
//        c++; //c = c + 1;
//        System.out.println(c);
//        System.out.println(7 % 4);
//        a += c; // a = a + c;
//        System.out.println(a);
//        System.out.println(++a);
//        System.out.println(a);
//        System.out.println(a != c);
//
//
//        boolean state = true;
//        int y = state == true ? 3 : 5; //ternary operator
//        System.out.println(y);

        int x = 7;
        int y = 5;
        System.out.println(x == 7 && y == 5);

        String str = "abc";
        String str2 = "def";
        int c = 5;
        int d = 3;
        str += str2; //str = str + str2;
        System.out.println(str + c);
        System.out.println(c + str + " ");
        System.out.println(str + c + d);
        System.out.println(c + d + " merhaba " + str);

        int benimParam = 100;
        int benimBorcum = 50;
        if (benimParam > benimBorcum) {
            System.out.println("Paranız yeterli, paranız:" + (benimParam - benimBorcum));
        }
        else{
            System.out.println("Paranız yeterli değil, paranız:" + (benimParam - benimBorcum));
        }

        int i = 3;
        System.out.println("i = "+ i +"' dir");



    }
}
