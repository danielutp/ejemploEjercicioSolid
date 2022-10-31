package com.co.solid;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidApplication {
    public static void main( String[] args ) throws Exception {
        Carro carro = new Carro("Kia", 2000, "Blanco", 2018);
        Moto moto = new Moto("Yamaha", 350, "2022", 150);
        int valor = carro.avaluoVehiculo();
        System.out.println("El valor del vehiculo es de :"+ valor);
        carro.capacidadPasajeros();
    }
}
