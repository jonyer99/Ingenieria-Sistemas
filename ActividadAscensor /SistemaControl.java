public class SistemaControl {
    private Ascensor ascensor;
    private int totalPisos;

    // Constructor que inicializa el sistema con un ascensor y un edificio de 5 pisos
    public SistemaControl() {
        this.ascensor = new Ascensor();
        this.totalPisos = 5;
        System.out.println("-> Sistema de Control de Ascensor inicializado para un edificio de " + totalPisos + " pisos.");
    }

    // Método para atender una solicitud de llamada desde un piso exterior
    public void gestionarLlamadaPiso(BotonPiso botonPiso) {
        System.out.println("\n[SISTEMA] Solicitud externa recibida en el piso " + botonPiso.getNumeroPiso() + " para " + botonPiso.getDireccion());
        botonPiso.presionar();
        
        // El ascensor se mueve al piso desde donde llaman
        int pisoOrigen = botonPiso.getNumeroPiso();
        ascensor.moverA(pisoOrigen);
        ascensor.abrirPuertas();
        
        // Simulamos que el pasajero entra y cierra puertas
        System.out.println("[SISTEMA] Pasajero ingresa a la cabina.");
        ascensor.cerrarPuertas();
    }

    // Método para atender una solicitud interna desde la cabina
    public void gestionarDestinoCabina(BotonCabina botonCabina) {
        System.out.println("\n[SISTEMA] Solicitud interna registrada en la cabina.");
        botonCabina.presionar();
        
        int pisoDestino = botonCabina.getPisoDestino();
        ascensor.moverA(pisoDestino);
        ascensor.abrirPuertas();
        
        System.out.println("[SISTEMA] El pasajero ha llegado a su destino. Saliendo de la cabina...");
        ascensor.cerrarPuertas();
    }

    // Getters
    public Ascensor getAscensor() {
        return ascensor;
    }

    public int getTotalPisos() {
        return totalPisos;
    }
}