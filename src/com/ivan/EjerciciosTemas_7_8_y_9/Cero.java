package com.ivan.EjerciciosTemas_7_8_y_9;

//reverse a string
public class Cero {
    public static void main(String[] args) {
        String str = "Hola Mundo";
        String reversed ="";

        for(int i = str.length() -1 ; i >= 0 ; i--){
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
    }
}
