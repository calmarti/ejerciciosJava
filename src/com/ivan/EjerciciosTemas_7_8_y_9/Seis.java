package com.ivan.EjerciciosTemas_7_8_y_9;

import java.util.ArrayList;

public class Seis {
    public static void main(String[] args) {
        //Operando con un Array List de tipo Integer
        ArrayList<Integer> arrListInt = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arrListInt.add(i);
        }

        System.out.println(arrListInt);

        for (int i = 0; i < arrListInt.size(); i++) {
            Integer elem = arrListInt.get(i);
            if (elem % 2 == 0) {
                arrListInt.remove(elem);
            }
        }
        System.out.println(arrListInt);

        for (Integer elem: arrListInt){
            System.out.println(elem);
        }
    }
}
