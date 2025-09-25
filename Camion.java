package models;

public class Camion extends Vehiculo implements Combustible {
    double capacidadCarga;

    public Camion(double capacidadCarga, String modelo, String marca) {
        super(modelo, marca);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mover() {
        System.out.println("El camión " + modelo + " " + marca + " se está moviendo.");
    }
    @Override
    public void recargar() {
        System.out.println("El camión " + modelo + " " + marca + " se está recargando combustible.");
    }
}
