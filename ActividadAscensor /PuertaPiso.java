public class PuertaPiso extends Puerta {
    private int numeroPiso;

    public PuertaPiso(int numeroPiso) {
        super();
        this.numeroPiso = numeroPiso;
    }

    @Override
    public void abrir() {
        super.abrir();
        System.out.println("Puerta exterior del piso " + numeroPiso + " abierta.");
    }
   




    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }
}