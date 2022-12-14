package com.ejercicioCuatro;

public class Main {

    public static void main(String[] args) {

        SmartPhone smartDevice = new SmartPhone("Samsung","S10","rojo");
        SmartWatch smartDevice1 = new SmartWatch("LG","L10","rojo");

        System.out.println(smartDevice.getMarca());
        System.out.println(smartDevice.getModelo());
        System.out.println(smartDevice.getColor());

        System.out.println(smartDevice1.getMarca());
        System.out.println(smartDevice1.getModelo());
        System.out.println(smartDevice1.getColor());


    }
}
