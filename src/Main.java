
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Auto
        Auto miAuto = new Auto("Toyota", "Corolla", 2020, 15000.5, 4, "Automática");
        
        // Probar los métodos del Auto
        System.out.println("Fabricante: " + miAuto.getFabricante());
        System.out.println("Modelo: " + miAuto.getModelo());
        System.out.println("Año: " + miAuto.getAño());
        System.out.println("Kilometraje: " + miAuto.getKilometraje());
        System.out.println("Número de puertas: " + miAuto.getNumPuertas());
        System.out.println("Tipo de transmisión: " + miAuto.getTipoTransmision());
        
        miAuto.arrancar();
        miAuto.abrirPuertas();
        miAuto.cerrarPuertas();
        miAuto.detener();

        System.out.println();

        // Crear un objeto de la clase Motocicleta
        Motocicleta miMoto = new Motocicleta("Harley-Davidson", "Sportster", 2019, 5000.75, 1200, "Deportivo");

        // Probar los métodos de la Motocicleta
        System.out.println("Fabricante: " + miMoto.getFabricante());
        System.out.println("Modelo: " + miMoto.getModelo());
        System.out.println("Año: " + miMoto.getAño());
        System.out.println("Kilometraje: " + miMoto.getKilometraje());
        System.out.println("Cilindrada: " + miMoto.getCilindrada());
        System.out.println("Tipo de manillar: " + miMoto.getTipoManillar());

        miMoto.arrancar();
        miMoto.hacerCaballito();
        miMoto.detenerCaballito();
        miMoto.detener();
    }
}
