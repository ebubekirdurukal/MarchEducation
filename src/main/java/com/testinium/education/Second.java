package com.testinium.education;

public class Second {
    public static void main(String[] args) {

//        int not = 55;
//        if (not < 59 && not > 0) {
//            System.out.println("Kaldın");
//        } else if (not < 70) {
//            System.out.println("D aldınız");
//        } else {
//            System.out.println("A aldınız");
//        }
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }
//        for (int i = 0; i < 100; i = i + 2) {
//            System.out.println(i);
//        }
////        for(;;){
////            System.out.println("Selam");
////        }
//        int[] dizi = {1, 2, 3};
//        for (int i : dizi) {
//            System.out.println(i);
//        }
//
//        int i = 3;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }
//
//        int j = 0;
//        while (j < 100) {
//            j += 7; // j = j + 7;
//            System.out.println(j);
//
//        }
//
//        do {
//            System.out.println(j);
//        } while (j < 5);

        abc:
        for (int x = 0; x < 4; x ++) {
            for (int y = 0; y < 5; y ++) {
                if(y==3) continue abc;

                System.out.println(x + " " + y);
            }
        }

        for(int i = 0; i< 100; i++){
            if(i % 4 == 0) continue;
            System.out.println(i);
        }




    }


}
