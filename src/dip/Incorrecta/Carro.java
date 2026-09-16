package dip.Incorrecta;

//! Esta mal, puesto que Carro(alto nivel) esta dependiendo DIRECTAMENTE de MotorGasolina(bajo nivel)
//! Si MotorGasolina deja de existir, la clase Carro deja de funcionar
public class Carro {
    
    private MotorGasolina motor = new MotorGasolina();

    public void arrancar() {
        motor.encender();
    }

}
