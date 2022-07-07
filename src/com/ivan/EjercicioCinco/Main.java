package com.ivan.EjercicioCinco;

import oop.herencia.Coche;

public class Main {

    
    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        cocheCRUD.save(new Coche());
        cocheCRUD.findAll();
        cocheCRUD.delete(new Coche());
    }
}
