public class AscensorMain {
    public static void main(String[] args) {
        System.out.println("=== INICIANDO SISTEMA DE CONTROL DE ASCENSOR ===");

        // 1. Instanciamos el objeto Ascensor
        Ascensor miAscensor = new Ascensor();

        // 2. Probamos los botones de los pisos (Herencia de BotonPiso)
        BotonPiso botonLlamado = new BotonPiso(3, "SUBIR");
        System.out.println("\n--- Prueba de Llamado en Piso ---");
        System.out.println("Piso actual del botón: " + botonLlamado.getNumeroPiso());
        System.out.println("Dirección solicitada: " + botonLlamado.getDireccion());
        botonLlamado.presionar(); // Enciende la luz del botón del piso

        // 3. Probamos los botones de la cabina (Herencia de BotonCabina)
        BotonCabina botonDestino = new BotonCabina(1, 5);
        System.out.println("\n--- Prueba de Selección en Cabina ---");
        botonDestino.presionar(); // Registra el destino y enciende la luz

        // 4. Simulamos el movimiento y apertura de puertas
        System.out.println("\n--- Operación del Ascensor ---");
        miAscensor.abrirPuertas();
        miAscensor.cerrarPuertas();

        System.out.println("\n=== PRUEBAS FINALIZADAS CON ÉXITO ===");
    }
}