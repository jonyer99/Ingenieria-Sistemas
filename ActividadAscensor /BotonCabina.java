public class BotonCabina extends Boton {
    private int pisoDestino;

    public BotonCabina(int numeroPiso, int pisoDestino) {
        super(numeroPiso); 
        this.pisoDestino = pisoDestino;
    }

    @Override
    public void presionar() {
        super.presionar(); 
        System.out.println("-> Solicitud registrada en la cabina para dirigirse al piso: " + this.pisoDestino);
    }

    public int getPisoDestino() {
        return pisoDestino;
    }

    public void setPisoDestino(int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }
}