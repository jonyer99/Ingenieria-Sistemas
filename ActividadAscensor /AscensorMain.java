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
        botonLlamado.presionar(); 

        // 3. Probamos los botones de la cabina (Herencia de BotonCabina)
        BotonCabina botonDestino = new BotonCabina(1, 5);
        System.out.println("\n--- Prueba de Selección en Cabina ---");
        botonDestino.presionar(); 

        // 4. Simulamos el movimiento y apertura de puertas de la cabina
        System.out.println("\n--- Operación Normal del Ascensor ---");
        miAscensor.abrirPuertas();
        miAscensor.cerrarPuertas();

        // 5. Probando la Puerta de un Piso en específico (PuertaPiso)
        System.out.println("\n--- Prueba de Puerta de Piso (Exterior) ---");
        PuertaPiso puertaPiso3 = new PuertaPiso(3);
        puertaPiso3.abrir();
        puertaPiso3.cerrar();

        // 6. Prueba de seguridad corregida: Sensor de obstáculos con ciclo completo
        System.out.println("\n--- Prueba de Sensor de Obstáculos ---");
        Puerta puertaPrueba = new Puerta();
        puertaPrueba.abrir(); 
        
        // Simulamos el obstáculo y tratamos de cerrar
        puertaPrueba.setSensorObstaculo(true); 
        puertaPrueba.cerrar(); // Esto disparará la alerta y reabrirá la puerta
        
        // Intentamos cerrar nuevamente tras haberse despejado el obstáculo
        System.out.println("Intentando cerrar nuevamente tras retirar el obstáculo...");
        puertaPrueba.cerrar(); 

        System.out.println("\n=== PRUEBAS FINALIZADAS CON ÉXITO ===");
    }
}