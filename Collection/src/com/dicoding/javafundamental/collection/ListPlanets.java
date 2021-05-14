package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanets {

    public static void main(String[] args) {
        // deklarasi array
        String[] heroes = new String[2];
        heroes[0] = "Reski";
        heroes[1] = "Mulud";

        // menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("Merkurius");
        planets.add("Venus");
        planets.add("Mars");
        planets.add("Bumi");

        System.out.println("List planet awal :");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t indeks ke-" + i + " adalah : " + planets.get(i));
        }

        // menghapus/mengeluarkan anggota list
        planets.remove(1); // mengeluarkan objek sesuai indeks

        System.out.println("List planet akhir : ");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t indeks ke-" + i + " adalah : " + planets.get(i));
        }
    }

}
