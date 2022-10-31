package com.co.solid;

import lombok.Data;

@Data
public abstract class Vehiculo implements IVehiculo{
    public String marca;
    public int peso;

    public Vehiculo(String marca, int peso) {
        this.marca = marca;
        this.peso = peso;
    }

    public abstract void capacidadPasajeros();
}
