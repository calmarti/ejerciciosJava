package com.ivan.EjercicioCinco;

import oop.herencia.Coche;

public class Main {
    static CocheCRUD cocheCRUD = new CocheCRUDImpl();
    
    public static void main(String[] args) {

        cocheCRUD.save(new Coche());
        cocheCRUD.findAll();
        cocheCRUD.delete(new Coche());
    }
}
