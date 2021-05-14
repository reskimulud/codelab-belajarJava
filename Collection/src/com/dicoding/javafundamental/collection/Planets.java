package com.dicoding.javafundamental.collection;

import java.util.HashMap;
import java.util.Map;

public class Planets {
    private String name;
    private double mass;

    public Planets(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Planet" + name + ", mass " + mass;
    }

}

class MapPlanet {

    public static void main(String[] args) {
        // menggunakan hash map
        Map<String, Planets> planets = new HashMap<>();
        planets.put("key-1", new Planets("Merkurius", 0.06)); // method put untuk menambahkan map
        planets.put("key-2", new Planets("Venus", 0.82));
        planets.put("key-3", new Planets("Bumi", 1.00));
        planets.put("key-4", new Planets("Mars", 0.11));
        planets.put("key-4", new Planets("Mars-X", 0.11)); // menambahkan map ke key yang sama

        // method size untuk mendapatkan ukuran/panjang map
        System.out.println("Map planet awal : (size : " + planets.size() + ")");
        for (String key : planets.keySet()) {
            // method get untuk mendapatkan isi dari Map berdasarkan key
            System.out.println("\t" + key + " : " + planets.get(key));
        }

        planets.remove("key-2"); // method mengeluarkan objek dari map

        System.out.println("Map planet akhir : (size : " + planets.size() + ")");
        for (String key : planets.keySet()) {
            // method get untuk mendapatkan isi dari Map berdasarkan key
            System.out.println("\t" + key + " : " + planets.get(key));
        }

    }

}