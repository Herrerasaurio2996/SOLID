package srp;

//! Responsabilidad unica: reporteria
public class VehiculoReporteGenerador {

    public void generarPDF(Vehiculo v) {
        System.out.println("Generando PDF con los datos de " + v.getMarca() + "...");
    }
    
}