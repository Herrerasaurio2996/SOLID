package srp;
public class App {
    public static void main(String[] args) throws Exception {
        
        // Instancia del objeto vehiculo
        Vehiculo carro = new Vehiculo("Toyota", 180);

        // Instancia del repositorio para guardar el objeto Vehiculo
        VehiculoRepositorio repo = new VehiculoRepositorio();
        repo.guardar(carro);

        // Instancia del reporte para (Suena redundante) generar un reporte sobre el objeto Vehiculo
        VehiculoReporteGenerador reporte = new VehiculoReporteGenerador();
        reporte.generarPDF(carro);
    }
}
