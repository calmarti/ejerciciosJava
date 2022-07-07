package oop.conInterfaces;

import oop.sinInterfaces.Empleado;

import java.util.List;

/*
* Se declaran los métodos, NO se implementan
* Actúa como un contrato: dice lo que hay que hacer, pero no el como
 */

public interface EmpleadoCRUD {

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);
}
