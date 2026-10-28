import java.time.LocalDate;

public class Pedido {
    private Cliente Cliente;
    private Producto producto;
    private LocalDate fecha;
    private Pago pago;

    public Pedido(
            Cliente Cliente,
            Producto Producto,
            LocalDate fecha,
            Pago pago) {

        this.Cliente = Cliente;
        this.producto = Producto;
        this.fecha = fecha;
        this.pago = pago;
    }

    public void mostrarPedido() {
        System.out.println("----- PEDIDO -----");
        System.out.println("Cliente: " + Cliente);
        System.out.println("Fecha: " + fecha);

        producto.mostrarInformacion();
    }

    public void pagar(double valor) {
        pago.procesarpago(valor);

    }

}
