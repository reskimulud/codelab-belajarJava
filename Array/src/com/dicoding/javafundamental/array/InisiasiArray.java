package com.dicoding.javafundamental.array;

public class InisiasiArray {

    public static void main(String[] args) {
        // cara pertama
        int[] arrInt = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println("Cara pertama");

        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);
        System.out.println();

        // cara ke dua (inisiasi per elemen)
        int[] arrInt2 = new int[6];

        arrInt2[0] = 1;
        arrInt2[1] = 2;
        arrInt2[2] = 3;
        arrInt2[3] = 4;
        arrInt2[4] = 5;
        arrInt2[5] = 6;

        System.out.println("Cara ke dua");

        System.out.println(arrInt2[0]);
        System.out.println(arrInt2[1]);
        System.out.println(arrInt2[2]);
        System.out.println(arrInt2[3]);
        System.out.println(arrInt2[4]);
        System.out.println(arrInt2[5]);
        System.out.println();
    }

}
