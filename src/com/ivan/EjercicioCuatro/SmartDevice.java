package com.ivan.EjercicioCuatro;

public abstract class SmartDevice {
    String fabricante;
    String modelo;
    String procesador;
    String pantalla;
    int RAM;
    boolean on = false;

    SmartDevice() {

    }

    public SmartDevice(String fabricante, String modelo, String procesador, String pantalla, int RAM) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.procesador = procesador;
        this.pantalla = pantalla;
        this.RAM = RAM;
    }

    public void encender() {
        if (!on) {
            on = true;
            System.out.println("El dispositivo se ha encendido");
        }
    }


    public void apagar() {
        if (on) {
            on = false;
            System.out.println("El dispositivo se ha apagado");
        }
    }


}