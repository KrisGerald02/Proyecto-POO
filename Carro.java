package models;

public class Carro extends Vehiculo implements Combustible {
    int numPuertas;

    public Carro(int numPuertas, String modelo, String marca) {
        super(modelo, marca);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mover() {
        System.out.println("El carro " + modelo + " " + marca + " se está moviendo.");
    }
    @Override
    public void recargar() {
        System.out.println("El carro " + modelo + " " + marca + " se está recargando combustible.");
    }
}
