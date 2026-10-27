import java.time.LocalDate;

public class pedido {
    privte Cliente Cliente;
    private Producto producto;
    private Localdate fecha;
    private pago pago;

    public pedido(
        Cliente Cliente;
        Producto Producto;
        LocalDate fecha;
        pago pago);{
            
            this.Cliente = Cliente;
            this.producto = Producto;
            this.fecha = fecha;
            this.pago =  pago;
            
            public void mostrarPedido() {
        System.out.println("----- PEDIDO -----");
        System.out.println("Cliente: " + Cliente);
        System.out.println("Fecha: " + fecha);

        producto.mostrarInformacion();
    }

    public void pagar(double valor) {
        pago.procesarPago(valor);


        }

    
}
