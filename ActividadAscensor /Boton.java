

public class Boton {
    private int numeroPiso;
    private boolean presionado;

    // Constructor para inicializar el botón
    public Boton(int numeroPiso) {
        this.numeroPiso = numeroPiso;
        this.presionado = false;
    }

    // Método cuando alguien presiona el botón
    public void presionar() {
        this.presionado = true;
        System.out.println("Botón del piso " + this.numeroPiso + " presionado. ¡Luz encendida!");
    }
}