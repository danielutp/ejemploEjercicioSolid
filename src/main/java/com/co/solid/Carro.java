package com.co.solid;

public class Carro extends Vehiculo{
    public String color;
    public int modelo;

    public Carro(String marca, int peso) {
        super(marca, peso);
    }

    public Carro(String marca, int peso, String color, int modelo) {
        super(marca, peso);
        this.color = color;
        this.modelo = modelo;
    }

    @Override
    public int avaluoVehiculo() {
        return modelo*10000;
    }

    @Override
    public void capacidadPasajeros() {
        System.out.print("La capacidad de pasajeros es de 5 como maximo");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
}
