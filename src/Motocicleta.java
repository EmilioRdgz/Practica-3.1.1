
public class Motocicleta extends Vehiculo {
    private int cilindrada;
    private String tipoManillar;

    // Constructor
    public Motocicleta(String fabricante, String modelo, int año, double kilometraje, int cilindrada, String tipoManillar) {
        super(fabricante, modelo, año, kilometraje);
        this.cilindrada = cilindrada;
        this.tipoManillar = tipoManillar;
    }

    // Getters y Setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoManillar() {
        return tipoManillar;
    }

    public void setTipoManillar(String tipoManillar) {
        this.tipoManillar = tipoManillar;
    }

    // Métodos adicionales
    public void hacerCaballito() {
        System.out.println("La motocicleta está haciendo un caballito.");
    }

    public void detenerCaballito() {
        System.out.println("La motocicleta ha detenido el caballito.");
    }
}
