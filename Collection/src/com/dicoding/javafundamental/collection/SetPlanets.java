package com.dicoding.javafundamental.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanets {

    public static void main(String[] args) {
        // menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("Merkurius");
        planets.add("Venus");
        planets.add("Mars");
        planets.add("Bumi");
        planets.add("Bumi");
        planets.add("Saturnus");

        System.out.println("Set planets awal : (size = " + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t " + planet);
        }

        planets.remove("Saturnus"); // method remove() untuk menghapus objek dari set

        System.out.println("Set planets akhir : (size = " + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext();) {
            // looping dengan iterator
            System.out.println("\t " + iterator.next());
        }
    }

}
