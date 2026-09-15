package lsp;

public class Bicicleta extends Vehiculo{

    Bicicleta(String marca, int velocidadMax) {
        super(marca, velocidadMax);
    }

    @Override
    public void acelerar() {
        System.out.println(marca + " acelera con pedaleo.");
    }
    
}
