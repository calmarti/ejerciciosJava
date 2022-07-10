package com.ivan;

import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;


public class dataStructures {
    public static void main(String[] args) {

        //Array bidimensional
        System.out.println("***Arrays bidimensionales***");

        int[][] BiDimArr = new int[2][3];
        BiDimArr[0][0] = 1;
        BiDimArr[0][1] = 2;
        BiDimArr[0][2] = 3;

        BiDimArr[1][0] = 4;
        BiDimArr[1][1] = 5;
        BiDimArr[1][2] = 6;

        for(int i=0; i < BiDimArr.length; i++){
            System.out.println("valor de i:" + i);
            for(int j=0; j < BiDimArr[i].length; j++){
                System.out.println("valor del elemento: " + BiDimArr[i][j]);
            }
        }



        //Vector
        System.out.println("***Vectores***");
        Vector<Integer> vector = new Vector<>(50, 15);   //por defecto capacity: 10 y capacityIncrment = x 2
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        System.out.println("vector: " + vector);
        //vector.remove(3);
        //System.out.println("vector tras eliminar elemento en posición 3: " + vector);
        System.out.println("tamaño del vector (size): " + vector.size());
        System.out.println("capacidad del vector (capacity): " + vector.capacity());

        for (int elemento : vector){
            System.out.println("desde for loop clasico: " + elemento);
        }

        for(int i=0; i < vector.size(); i++){
            System.out.println("desde foreach loop " + vector.get(i));  //no puedo acceder directamente, debo usar .get()
        }

        vector.trimToSize();  //reduce la capacidad del vector a su tamaño actual
        System.out.println("capacidad tras trimToSize: " + vector.capacity());


        //TODO: entender que pasa en este bucle!
        for(int i=0; i < vector.size(); i++){
            System.out.println(i);
            if (i%2==0){
                vector.remove(i);
                continue;
            }
            System.out.println("desde for loop clasico con remove de elementos con índices pares: " + vector.get(i));
        }



        //ArrayLists
        System.out.println("***ArrayLists***");
        //antigua forma de declarar un ArrayList:
        //List lista = new ArrayList<String>();

        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("elemento 1");
        arrList.add("elemento 2");
        arrList.add("elemento 3");
        arrList.add("elemento 4");
        System.out.println(arrList);
        arrList.remove("elemento 4");
        System.out.println(arrList);

        for(int i=0; i < arrList.size(); i++){
            System.out.println("desde for loop clasico: " + arrList.get(i));   //no puedo acceder directamente, debo usar .get()
        }

        for (String elem : arrList){
            System.out.println("desde foreach loop: " + elem);
        }

        //convertir un ArrayList existente en un Array:
        String[] arr = new String[arrList.size()];
        for(int i=0; i < arrList.size(); i++){
            arr[i] = arrList.get(i);
         }

        for(String elem : arr){
            System.out.println("desde foreach loop con ArrayList convertido en Array: " + elem);
        }

        //incremento por defecto de la capacidad:
        //caso del vector: capacidad*2
        //caso del arraylist: capacidad*0.5


        //Linked lists
        System.out.println("***Linked Lists***");
        // mismos métodos y propiedades del ArrayList
        //la LinkedList es más rápida que el ArrayList para modificar datos (por oposición a buscar o almacenar)
        LinkedList<String> listaEnlazada = new LinkedList<>(arrList);   //crea una LinkedList a partir de un ArrayList
        System.out.println(listaEnlazada);

        //Hash Maps (implementación de la interfaz Map)
        System.out.println("***Hash Maps***");
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);
        mapa.put("clave4", 40);
       //mapa.put("clave4", 50);   Si agrego una clave ya existente su valor sobreescribirá el actual
        //mapa.replace("clave4", 50); la manera apropiada de cambiar un valor de una clave existente
        //tanto put como replace primero buscan la clave introducida
        //OJO:  En el caso de replace si la clave no existe NO hará nada pero NO lanzará ningún error.
        System.out.println(mapa);
        System.out.println(mapa.get("clave1"));
        mapa.remove("clave4");
        System.out.println(mapa);

        //iterar sobe un hashmap
        for (Map.Entry elemento : mapa.entrySet()){
            System.out.println("elemento del mapa: " + elemento);
            System.out.println("clave: " + elemento.getKey());
            System.out.println("valor: " + elemento.getValue());
        }

        //Tree map  o red-black binary tree: otra implementación de la interfaz Map y muy parecida a HashMap, investigar para que se usa
    }

}
