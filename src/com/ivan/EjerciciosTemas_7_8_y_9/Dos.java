package com.ivan.EjerciciosTemas_7_8_y_9;

//traverse a bidimensional array on integers
public class Dos {
    public static void main(String[] args) {
        int[][] biArr = new int[2][3];
        biArr[0][0] = 2;
        biArr[0][1] = 3;
        biArr[0][2] = 5;
        biArr[1][0] = 7;
        biArr[1][1] = 11;
        biArr[1][2] = 13;
        for(int i=0; i < biArr.length; i++){
            for(int j=0; j < biArr[i].length;j++){
                System.out.println("Position: " + i + j);
                System.out.println("Elem: " + biArr[i][j]);
            }
        }
    }


}
