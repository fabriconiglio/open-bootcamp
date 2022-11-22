package com.ejercicioDos;

//Para este ejercicio tendréis que crear una función que reciba un precio
// y devuelva el precio con el IVA incluido.
public class EjercicioDos {

    public static void main(String[] args) {

        System.out.println("El precio con IVA es: " + getPrecio(10.0));

}



    public static Double getPrecio(Double precio){

        Double resultado = (precio * 0.21) + precio;

        return resultado;

   }
}
