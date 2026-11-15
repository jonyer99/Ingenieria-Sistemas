public class Ascensor {
    private int pisoActual;
    private PuertaAscensor puertaCabina; // composicion

    public Ascensor() {
        this.pisoActual = 1; // Arranca por defecto en el piso 1
        this.puertaCabina = new PuertaAscensor(); // Inicializamos la puerta de la cabina
    }

    public void abrirPuertas() {
        puertaCabina.abrir(); 
        System.out.println("Las puertas de la cabina se han abierto en el piso: " + pisoActual);
    }

    public void cerrarPuertas() {
        puertaCabina.cerrar();
        System.out.println("Las puertas de la cabina se han cerrado.");
    }
    
    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }
}