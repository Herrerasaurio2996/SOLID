package srp;

//! La clase tiene mas de una responsabilidad, lo cual esta mal segun los principios SOLID (SRP)
public class Vehiculo {
    
    //Atributos
    private String marca;
    private int velocidadMax;

    //? Constructor
    Vehiculo(String marca, int velocidadMax){
        this.marca = marca;
        this.velocidadMax = velocidadMax;
    }

    //? GETTERS
    public String getMarca() {
        return marca;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    //? SETTERS
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVelocidadaMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    //* Metodos

    public void acelerar() {
        System.out.println(marca + " esta acelerando.");
    }

    //! Los siguientes metodos son 2 responsabilidades mas, esto esta mal, pero para el ejercicio se mantienen comentados
    // Responsabilidad 2: persistencia 
    //
    // public void guardarEnBasesDeDatos() {
    //    System.out.println("Conectando a la BD...");
    //    System.out.println("INSERT INTO vehiculos VALUES ('" + marca + "', " + velocidadMax + ")");
    //}

    // Responsabilidad 3: generacion de reportes
    //public void generarReportePDF() {
    //    System.out.println("Generando PDF con los datos de " + marca + "...");
    //}

}
