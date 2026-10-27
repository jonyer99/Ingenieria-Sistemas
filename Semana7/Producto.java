public class Producto {
    protected int numero;

    public Producto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    public void mostrarInformacion(){
        System.out.println("numero de producto:" + numero);
        
    }
    
    
}
