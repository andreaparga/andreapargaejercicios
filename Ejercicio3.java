package com.example.tema3;

public class Ejercicio3 {

    public static void main(String[] args) {

        String cadena = "";
        String[] nombres = {"Juan", "Pablo", "Rosa", "Eva"};

        for(String nombre: nombres){
            cadena = cadena + nombre + " ";
        }
        System.out.println(cadena);
    }

}
