
public class Auto extends Vehiculo {
    private int numPuertas;
    private String tipoTransmision;

    // Constructor
    public Auto(String fabricante, String modelo, int año, double kilometraje, int numPuertas, String tipoTransmision) {
        super(fabricante, modelo, año, kilometraje);
        this.numPuertas = numPuertas;
        this.tipoTransmision = tipoTransmision;
    }

    // Getters y Setters
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    // Métodos adicionales
    public void abrirPuertas() {
        System.out.println("Las puertas del auto se están abriendo.");
    }

    public void cerrarPuertas() {
        System.out.println("Las puertas del auto se están cerrando.");
    }
}
