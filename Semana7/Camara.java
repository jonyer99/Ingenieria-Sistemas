public class Camara {

publec class Camara xtends producto{

    private String marca;
    private String modelo;
    
}

public Camara(int numero,String marca, String modelo) {
    super (numero);
    this.marca= marca;
    this.modelo= modelo;
}
@Override 
public void mostrarInformacion(){

    System.out.println("producto: + Camara");
    System.out.println("numero: + numero ");
    System.out.println("marca: + marca");
    System.out.println("modelo:+ modelo ");
}

    
}