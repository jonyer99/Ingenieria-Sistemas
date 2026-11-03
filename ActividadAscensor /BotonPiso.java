public class BotonPiso extends Boton {
    private String direccion; // "SUBIR" o "BAJAR"

    public BotonPiso(int numeroPiso, String direccion) {
        super(numeroPiso); // Hereda el número de piso de la clase Boton
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
}