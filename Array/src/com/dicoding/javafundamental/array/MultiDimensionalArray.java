package com.dicoding.javafundamental.array;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        char[][] arrChar = new char[2][];
        arrChar[0] = new char[2];
        arrChar[1] = new char[3];

        // dimensi 1 yang index nya 0 memiliki 2 elemen
        arrChar[0][0] = 'A';
        arrChar[0][1] = 'B';

        // dimensi 1 yang indeks nya 1 memiliki 3 elemen
        arrChar[1][0] = 'C';
        arrChar[1][1] = 'D';
        arrChar[1][2] = 'E';

        // tampilkan semua data
        for (int i = 0; i < arrChar.length; i++) {
            for (int j = 0; j < arrChar[i].length; j++) {
                System.out.println("Dimensi 1 dengan indeks " + i + " dan dimensi 2 dengan indeks " + j + " adalah : " + arrChar[i][j]);
            }
        }
    }

}
