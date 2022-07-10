package com.ivan;

public class ReverseAString {
    public static void main(String[] args) {
        String string = "Metallica";
        String reversedString="";

        for(int i=string.length()-1; i >= 0; i--){
           reversedString += string.charAt(i);
        }
        System.out.println(reversedString);
    }
}
