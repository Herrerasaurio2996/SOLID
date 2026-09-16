package isp.Correcta;

public class Avioneta implements Aereo, Terrestre{

    @Override
    public void andarEnTierra() {
        System.out.println("La avioneta rueda por la pista.");
    }

    @Override
    public void volar() {
        System.out.println("La avioneta esta volando.");
    }
    
}
