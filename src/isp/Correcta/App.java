package isp.Correcta;

public class App {
    public static void main(String[] args) {

        //* Instancia de cada vehiculo
        Carro carro = new Carro();
        Avioneta avioneta = new Avioneta();
        VehiculoAnfibio vehiculoAnfibio = new VehiculoAnfibio();

        //? Implementacion correspondiente de cada objeto vehiculo con los metodos que son capaces de hacer
        carro.andarEnTierra();
        avioneta.andarEnTierra();
        avioneta.volar();
        vehiculoAnfibio.andarEnTierra();
        vehiculoAnfibio.navegar();
    }
    
}
