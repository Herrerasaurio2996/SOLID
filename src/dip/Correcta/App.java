package dip.Correcta;

public class App {
    public static void main(String[] args) {
        
        //* Instancia del objeto Carro, con motor a gasolina
        Carro carroGasolina = new Carro(new MotorGasolina());
        carroGasolina.arrancar();

        //* Instancia del objeto Carro, con motor electrico
        Carro carroElectrico = new Carro(new MotorElectrico());
        carroElectrico.arrancar();

        //* Instancia del objeto Carro, con motor a vapor
        Carro carroAVapor = new Carro(new MotorAVapor());
        carroAVapor.arrancar();

    }
}
