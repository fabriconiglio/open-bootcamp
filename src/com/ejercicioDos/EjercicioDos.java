package com.ejercicioDos;

import java.util.Scanner;

//Para este ejercicio tendréis que crear una función que reciba un precio
// y devuelva el precio con el IVA incluido.
public class EjercicioDos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        Double numero = scanner.nextDouble();
        System.out.println("El precio con IVA es: " + getPrecio(numero));

}



    public static Double getPrecio(Double precio){

        Double resultado = (precio * 0.21) + precio;

        return resultado;

   }
}
