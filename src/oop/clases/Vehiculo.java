package oop.clases;

public class Vehiculo {
    //atributos
    protected String fabricante;
    protected String modelo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
    protected Motor motor;

    //constructores

    public Vehiculo(){
    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }


    public Vehiculo(String fabricante, String modelo){
    }

    //métodos
    public void acelerar(double quantity){
        this.speed += quantity;
    }

}
