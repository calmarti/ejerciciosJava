package oop.sinInterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    //estructura de datos: interfaz List de tipo ArrayList
    List<Empleado> empleados = new ArrayList<>();


    //operaciones CRUD
    //Create: guardar
    public void save(Empleado empleado){
        empleados.add(empleado);
        System.out.println("El empleado " + empleado.nombre + " ha sido guardado");

    }

    public List<Empleado> findAll(){
        return empleados;
    }

}
