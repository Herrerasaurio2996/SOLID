package dip.Correcta;

public class Carro {
    
    //* Atributos
    private Motor motor;

    //* Constructor
    Carro(Motor motor) {
        this.motor = motor;
    }

    public void arrancar() {
        motor.encender();
    }

}
