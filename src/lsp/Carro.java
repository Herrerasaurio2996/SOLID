package lsp;

public class Carro extends Vehiculo implements ConMotor{

    Carro(String marca, int velocidadMax) {
        super(marca, velocidadMax);
    }
    
    @Override
    public void acelerar() {
        acelerarConMotor();
    }

    @Override
    public void acelerarConMotor() {
        System.out.println(marca + " acelera usando el motor.");
    }
}
