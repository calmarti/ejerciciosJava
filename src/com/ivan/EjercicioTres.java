package com.ivan;

public class EjercicioTres {
    public static void main(String[] args) {
        String[] palabras = {"Hola", "a", "todos", "los", "presentes"};
        String mensaje = "";
        for (String palabra : palabras) {
            mensaje = mensaje + palabra + " ";
        }
        System.out.println(mensaje);
    }
}