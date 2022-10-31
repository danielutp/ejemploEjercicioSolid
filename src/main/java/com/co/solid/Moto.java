package com.co.solid;

import lombok.Data;

@Data
public class Moto extends Vehiculo implements IMoto{

    public String modelo;
    public int cilindraje;
    public int velocidad;

    public Moto(String marca, int peso, String modelo, int cilindraje) {
        super(marca, peso);
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.velocidad = 0;
    }

    @Override
    public int avaluoVehiculo() {
        return cilindraje*500000;
    }

    @Override
    public void capacidadPasajeros() {
        System.out.println("Tiene capadidad de 2 pasajeros");
    }

    @Override
    public void levantarMoto() {
        velocidad+=40;
    }
}
