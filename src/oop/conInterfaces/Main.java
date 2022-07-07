package oop.conInterfaces;

import oop.sinInterfaces.Empleado;

public class Main {

    static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDMySQL();

    public static void main(String[] args) {

        empleadoCRUD.findAll();
        empleadoCRUD.save(new Empleado());
        empleadoCRUD.delete(new Empleado());



    }
}
