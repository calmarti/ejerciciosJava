package com.ivan.EjercicioCinco;

import oop.herencia.Coche;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save(Coche coche) {
        System.out.println("método save");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("método findAll");
        return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("método delete");

    }
}
