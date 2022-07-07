package com.ivan.EjercicioCinco;

import oop.herencia.Coche;

import java.util.List;

public interface CocheCRUD {

    void save(Coche coche);

    List<Coche> findAll();

    void delete(Coche coche);

}
