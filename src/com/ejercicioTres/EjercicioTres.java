package com.ejercicioTres;

public class EjercicioTres {

    //En este ejercicio tenéis que crear un bucle que permita concatenar textos
    // e imprima el resultado final por consola.
    public static void main(String[] args) {

        String [] textos = {"Hola","que","tal","estas"};
        String resultado = "";

        for (int i = 0; i < textos.length; i++) {
            resultado += textos[i] + " ";
        }
        System.out.println(resultado);
    }
}
