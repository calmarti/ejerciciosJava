package com.ivan.EjercicioCuatro;

public class SmartPhone extends SmartDevice {
    String camara;


    public SmartPhone() {
    }

    public SmartPhone(String fabricante, String modelo, String procesador, String pantalla, int RAM, String camara) {
        super(fabricante, modelo, procesador, pantalla, RAM);
        this.camara = camara;
    }

    public void llamar(int numero){
        System.out.println("realizando llamada al " + numero );
    }
}
