package models;

public class Moto extends Vehiculo implements Combustible{
    boolean tieneSidecar;

    public Moto(boolean tieneSidecar, String modelo, String marca) {
        super(modelo, marca);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mover() {
        System.out.println("La moto " + modelo + " " + marca + " se está moviendo.");
    }
    @Override
    public void recargar() {
        System.out.println("La moto " + modelo + " " + marca + " se está recargando combustible.");
    }
}
