
public class Ascensor {
    // 1. Atributos (Lo que el ascensor "conoce" o "tiene")
    private int pisoActual;
    private boolean puertasAbiertas;

    // 2. Constructor (Para inicializar el ascensor cuando arranca el programa)
    public Ascensor() {
        this.pisoActual = 1; // Arranca por defecto en el piso 1
        this.puertasAbiertas = false; // Puertas cerradas al empezar
    }

    // 3. Métodos (Lo que el ascensor "sabe hacer")
    public void abrirPuertas() {
        puertasAbiertas = true;
        System.out.println("Las puertas se han abierto en el piso: " + pisoActual);
    }

    public void cerrarPuertas() {
        puertasAbiertas = false;
        System.out.println("Las puertas se han cerrado.");
    }
}
