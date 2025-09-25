package models;

public abstract class Vehiculo {
    String modelo;
    String marca;
    public Vehiculo(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }
    public abstract void mover();
}
