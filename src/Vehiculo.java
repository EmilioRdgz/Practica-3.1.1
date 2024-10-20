
public class Vehiculo {
    private String fabricante;
    private String modelo;
    private int año;
    private double kilometraje;

    // Constructor
    public Vehiculo(String fabricante, String modelo, int año, double kilometraje) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
    }

    // Getters y Setters
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    // Métodos adicionales
    public void arrancar() {
        System.out.println("El vehículo está arrancando.");
    }

    public void detener() {
        System.out.println("El vehículo se ha detenido.");
    }
}
