public class PuertaAscensor extends Puerta {
    private int pisoActual;

    // Constructor vacío que soluciona el error en Ascensor.java
    public PuertaAscensor() {
        super();
        this.pisoActual = 1;
    }

    public PuertaAscensor(int pisoActual) {
        super();
        this.pisoActual = pisoActual;
    }

    @Override
    public void abrir() {
        super.abrir();
        System.out.println("Puerta de la cabina del ascensor abierta en el piso " + pisoActual);
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }
}