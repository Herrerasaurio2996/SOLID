package lsp;

public abstract class Vehiculo {

    protected String marca;
    protected int velocidadMax;

    Vehiculo(String marca, int velocidadMax) {
        this.marca = marca;
        this.velocidadMax = velocidadMax;
    }

    public abstract void acelerar();
}
