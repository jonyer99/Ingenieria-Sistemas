public class BotonPiso extends Boton {
    private String direccion; // "SUBIR" o "BAJAR"

    public BotonPiso(int numeroPiso, String direccion) {
        super(numeroPiso); 
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}