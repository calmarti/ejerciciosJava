package com.ivan.EjerciciosTemas_7_8_y_9;

import java.util.Vector;

public class Tres {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        vec.add("Tyson");
        vec.add("Dempsey");
        vec.add("Liston");
        vec.add("Frazier");
        vec.add("Ali");

        vec.remove("Dempsey");
        vec.remove("Liston");

        System.out.println(vec);

        for(int i=0; i < vec.size(); i++){
            System.out.println("Elemento " + i + ": " + vec.get(i));
        }

    }
}