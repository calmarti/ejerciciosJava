package com.ivan.EjerciciosTemas_7_8_y_9;

import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Cinco {

    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("David Fincher");
        arrList.add("Martin Scorcesse");
        arrList.add("Quentin Tarantino");
        arrList.add("Cristhopher Nolan");

        //convertir un array list en linked lists
        LinkedList<String> linkedList = new LinkedList<>(arrList);

        //mostrar cada elemento del linked list y cada elemento del array list
        for (int i=0; i < linkedList.size(); i++){
            System.out.println("Linked List's element " + i + ": " + linkedList.get(i));
        }
        for (int i=0; i < arrList.size(); i++){
            System.out.println("Array List's element " + i + ": " + arrList.get(i));
        }





    }

}