public class Ascensor {
    private int pisoActual;
    private int pisoMaximo;
    private int pisoMinimo;
    private PuertaAscensor puertaCabina; // Relación Composición

    // Constructor que inicializa el ascensor en el piso 1 con un límite de 5 pisos
    public Ascensor() {
        this.pisoActual = 1;
        this.pisoMinimo = 1;
        this.pisoMaximo = 5; // Ajustado a 5 pisos
        this.puertaCabina = new PuertaAscensor(1); 
    }

    // Método para mover el ascensor validando los límites del edificio
    public void moverA(int pisoDestino) {
        if (pisoDestino < pisoMinimo || pisoDestino > pisoMaximo) {
            System.out.println("-> ¡ERROR! El piso " + pisoDestino + " está fuera del rango del edificio (" + pisoMinimo + " a " + pisoMaximo + ").");
            return;
        }

        if (pisoDestino == pisoActual) {
            System.out.println("-> El ascensor ya se encuentra en el piso " + pisoActual);
            return;
        }

        System.out.println("-> Moviendo ascensor desde el piso " + pisoActual + " hacia el piso " + pisoDestino + "...");
        
        // Simulamos el recorrido piso por piso
        if (pisoDestino > pisoActual) {
            for (int i = pisoActual + 1; i <= pisoDestino; i++) {
                System.out.println("   Subiendo... Pasando por el piso " + i);
            }
        } else {
            for (int i = pisoActual - 1; i >= pisoDestino; i--) {
                System.out.println("   Bajando... Pasando por el piso " + i);
            }
        }

        // Actualizamos la posición final
        this.pisoActual = pisoDestino;
        this.puertaCabina.setPisoActual(this.pisoActual);
        System.out.println("-> El ascensor ha llegado y se ha detenido en el piso " + this.pisoActual);
    }

    public void abrirPuertas() {
        System.out.println("-> Abriendo puertas de la cabina en el piso actual (" + pisoActual + ")");
        puertaCabina.abrir(); 
    }

    public void cerrarPuertas() {
        System.out.println("-> Cerrando puertas de la cabina...");
        puertaCabina.cerrar();
    }
    
    // Getters y Setters
    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
        this.puertaCabina.setPisoActual(pisoActual);
    }
}