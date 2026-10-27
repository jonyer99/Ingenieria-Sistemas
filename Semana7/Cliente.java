public class Cliente {
    private String cedula;
    private String nombre;
    
    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public string getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Cliente [cedula=" + cedula + ", nombre=" + nombre + "]";
    }
    @Override 
    public void mostrarInformacion(){
        System.out.pintln("producto:Inpresion");
        System.out.println("numero:" + numero);
        System.out.println("color:" + color);
        
        if (hoja != null){
            System.out.println("foto:" + hoja.grtfichero());
        }
    }
    
}
