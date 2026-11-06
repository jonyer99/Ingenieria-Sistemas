public class Puerta {
    
    private String estado; // "ABIERTA", "CERRADA"
    private boolean sensorObstaculo;

    public Puerta() {
        this.estado = "CERRADA";
        this.sensorObstaculo = false;
    }

    public void abrir() {
        this.estado = "ABIERTA";
        System.out.println("-> Las puertas se han abierto de forma automática.");
    }

    public void cerrar() {
        if (!sensorObstaculo) {
            this.estado = "CERRADA";
            System.out.println("-> Las puertas se han cerrado.");
        } else {
            System.out.println("-> ¡ALERTA! Obstáculo detectado en la puerta. Abriendo de nuevo...");
            abrir();
        }
    }

    // Getters y Setters
    public String getEstado() { return estado; }
    public boolean isSensorObstaculo() { return sensorObstaculo; }
    public void setSensorObstaculo(boolean sensorObstaculo) { this.sensorObstaculo = sensorObstaculo; }
}
    
}
