package com.dicoding.javafundamental.operator;

public class OperatorUnary {

    public static void main(String[] args) {
        System.out.println("Operator Unary plus");
        int nilaiAwal = 5;
        int hasil = +nilaiAwal;
        System.out.println("Hasil +5 adalah : " + hasil);
        System.out.println();

        System.out.println("Operasi Unary minus");
        int nilaiAwal2 = 5;
        int hasil2 = -nilaiAwal2;
        System.out.println("Hasil -5 adalah : " + hasil2);
        System.out.println();

        System.out.println("Operasi Unary Increment");
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("Hasil 5++ adalah : " + nilaiAwal3);
        System.out.println();

        System.out.println("Operator Unary Decrement");
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("Hasil 5-- adalah : " + nilaiAwal4);
        System.out.println();

        System.out.println("Operasi Unary komplemen logika");
        boolean sukses = false;
        System.out.println("Hasil !false adalah : " + !sukses);
    }

}
