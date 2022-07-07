package com.ivan.EjercicioCuatro;

public class Main {
    public static void main(String[] args) {

        SmartPhone iphone = new SmartPhone("Apple", "Iphone 13", "A13", "Retina", 6, "48px");
        System.out.println("El " + iphone.modelo + " tiene las siguientes specs:");
        System.out.println("Procesador: " + iphone.procesador);
        System.out.println("Pantalla: " + iphone.pantalla);
        System.out.println("RAM: " + iphone.RAM + "GB");
        System.out.println("Cámara: " + iphone.camara);

        iphone.llamar(6500000);

        SmartWatch galaxyWatch = new SmartWatch("Samsung", "GalaxyWatch", "ARM", "AMOLED", 4, false);
        System.out.print("El " + galaxyWatch.modelo + " es un modelo de smartwatch ");

        if(galaxyWatch.hibrido) {
            System.out.print("hibrido");
        }
        else{
            System.out.print("que solo tiene aplicaciones de fitness");
        }
        System.out.println();
        galaxyWatch.encender();
        galaxyWatch.apagar();

    }
}
