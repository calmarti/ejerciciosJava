package oop.sinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado paco = new Empleado("Paco", 45, 1000, true);
        Empleado maria = new Empleado("Maria", 23, 1000, true);
        Empleado pepe = new Empleado("Pepe", 20, 1000, true);

        empleadoCRUD.save(paco);
        empleadoCRUD.save(maria);
        empleadoCRUD.save(pepe);

        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);

    }
}
