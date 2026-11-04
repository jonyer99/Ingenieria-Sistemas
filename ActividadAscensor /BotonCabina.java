public class BotonCabina extends Boton {
    // Atributo específico para el piso de destino seleccionado dentro de la cabina
    private int pisoDestino;

    // Constructor que recibe el número de piso del botón y el piso destino asociado
    public BotonCabina(int numeroPiso, int pisoDestino) {
        super(numeroPiso); // Llama al constructor de la clase padre (Boton)
        this.pisoDestino = pisoDestino;
    }

    // Sobrescribimos el método presionar para añadir la lógica de la cabina
    @Override
    public void presionar() {
        super.presionar(); // Ejecuta la acción genérica del botón padre
        System.out.println("-> Solicitud registrada en la cabina para dirigirse al piso: " + this.pisoDestino);
    }

    // Getters y Setters para el piso destino (Encapsulamiento)
    public int getPisoDestino() {
        return pisoDestino;
    }

    public void setPisoDestino(int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }
}