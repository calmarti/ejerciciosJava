package com.ivan.EjerciciosTemas_7_8_y_9;

public class Siete {

    public static void main(String[] args) {
        try {
            int resultado = dividir(2, 0);
            System.out.println(resultado);
        }catch(Exception e){           //el Type Exception puede ser cualquier tipo de excepción que arroje la función
            System.out.println("Esto no puede hacerse: " + e.getMessage());
        }
        finally{
            System.out.println("Demo de código");
        }
    }

    public static int dividir(int a, int b) throws ArithmeticException {
        try{
            return a/b;
        }
        catch(ArithmeticException e){
            throw e;
        }

    }
}