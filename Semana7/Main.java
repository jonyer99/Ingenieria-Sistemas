import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "123456789",
                "Carlos Pérez");

        Foto foto = new Foto("foto_vacaciones.jpg");

        Producto producto = new Impresion(
                 1,
                "Color",
                foto);

        Pago metodoPago = new TC();

        Pedido pedido = new Pedido(
                cliente,
                producto,
                LocalDate.now(),
                metodoPago);

        pedido.mostrarPedido();

        pedido.pagar(25000);
    }

}
