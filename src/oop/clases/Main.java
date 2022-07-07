package oop.clases;

import oop.herencia.Coche;
import oop.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {
     //crear un objeto con el constructor vacío
     Vehiculo toyotaPrius = new Vehiculo();

     Motor motorGTI = new Motor("GTI", 190, 459.0, 6);

     //crear un objeto con un contructor con parámetros
     Vehiculo fordMondeo  = new Vehiculo("Ford", "Mondeo", 2.1, 2010, false, 0,  motorGTI);

     //herencia
     Motocicleta kawasakiNinja = new Motocicleta();
     kawasakiNinja.fabricante = "Kawasaki";
     System.out.println(kawasakiNinja.fabricante);

     //polimorfismo
     //el identificador vehiculo es de tipo Vehiculo, de ahí que puede reasignarsele un objeto Motocicleta o un objeto Coche (ambos hijos de Vehiculo)
     Vehiculo vehiculo;
     vehiculo = new Motocicleta();
     vehiculo.acelerar(50);

     vehiculo = new Coche();
     vehiculo.acelerar(50);

     //clase abstracta
     //la clase abstracta (modificador 'abstract') no instancia objetos, solo sus hijos pueden instanciar
     System.out.println("The end");

    }
}
