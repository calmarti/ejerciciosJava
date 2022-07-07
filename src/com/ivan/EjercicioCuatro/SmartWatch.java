package com.ivan.EjercicioCuatro;

public class SmartWatch extends SmartDevice {
    boolean hibrido;

    public SmartWatch(){

    }

    public SmartWatch(String fabricante, String modelo, String procesador, String pantalla, int RAM, boolean hibrido) {
        super(fabricante, modelo, procesador, pantalla, RAM);
        this.hibrido = hibrido;
    }
}
