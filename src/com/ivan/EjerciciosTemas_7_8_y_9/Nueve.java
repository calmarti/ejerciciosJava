package com.ivan.EjerciciosTemas_7_8_y_9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

//Este programa crea un Hash Map a partir de la información contenida en la ruta "/etc/passwd"
//Las claves del mapa son los códigos ascii de los caracteres que aparecen en el fichero
//Los valores del mapa son los caracteres correspondientes a las claves (códigos ASCII)

public class Nueve {
    public static void main(String[] args) {

        HashMap<Integer, Character> mapa = new HashMap<>();

        try {
            InputStream fichero = new FileInputStream("/etc/passwd");
            try {
                int bait = fichero.read();    // read => lee byte a byte (el type es int porque al leer los caracteres vienen en código ASCII)
                while(bait!=-1){
                    mapa.put(bait,(char)bait);
                    System.out.print((char)bait);
                    bait = fichero.read();  //actualizo el valor de bait
                }

            }catch(IOException e){
                System.out.println("Se ha producido una excepción: " + e.getMessage());
            }
        }catch(FileNotFoundException e){
            System.out.println("Se ha producido una excepción: " + e.getMessage());  //o bien getLocalizedMessage() por si hay traducción
        }

        System.out.println(mapa);
    }
}
