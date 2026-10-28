public class Transferencia extends Pago {
    @Override 
    public void procesarpago(double valor){
        System.out.println(" pago por transferecia:" + valor);
    }    
}
