import java.util.ArrayList;
import java.util.List;

public class SistemaControl {
    private Ascensor ascensor;
    private List<BotonPiso> botonesPisos;
    private List<BotonCabina> botonesCabina;

    public SistemaControl() {
        this.ascensor = new Ascensor();
        this.botonesPisos = new ArrayList<>();
        this.botonesCabina = new ArrayList<>();
    }

    // Método para simular la gestión de solicitudes y optimización de movimiento
    public void procesarSolicitud(int pisoDestino) {
        System.out.println("\n[SistemaControl] Procesando solicitud hacia el piso: " + pisoDestino);
        ascensor.abrirPuertas();
        System.out.println("[SistemaControl] El usuario ingresa al ascensor.");
        ascensor.cerrarPuertas();
        System.out.println("[SistemaControl] El ascensor se desplaza al piso " + pisoDestino + ".");
        ascensor.abrirPuertas();
        System.out.println("[SistemaControl] Destino alcanzado con éxito.");
    }
}