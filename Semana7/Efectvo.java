public class Efectvo extends Pago {
    @Override 
    public void procesarpago(double valor){
        System.out.println("pago en efectivo:" + valor);
        
    }
    
}
