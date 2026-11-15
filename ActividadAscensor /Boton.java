public class Boton {
    private int numeroPiso;
    private boolean presionado;

    public Boton(int numeroPiso) {
        this.numeroPiso = numeroPiso;
        this.presionado = false;
    }

    public void presionar() {
        this.presionado = true;
        System.out.println("Botón del piso " + this.numeroPiso + " presionado. ¡Luz encendida!");
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public boolean isPresionado() {
        return presionado;
    }

    public void setPresionado(boolean presionado) {
        this.presionado = presionado;
    }
}