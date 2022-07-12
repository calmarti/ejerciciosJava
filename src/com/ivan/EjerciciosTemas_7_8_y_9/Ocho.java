package com.ivan.EjerciciosTemas_7_8_y_9;

import java.io.*;

public class Ocho {
    public static void main(String[] args) throws Exception {
        try {
            InputStream fileIn = new FileInputStream("/~/sandbox/examplo.txt");
            PrintStream fileOut = new PrintStream("target.txt");

            byte[] contenido = fileIn.readAllBytes();
            fileOut.write(contenido);

        }catch(Exception e){
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }
    }

}
