package abstrac_class;

public class BotonMain {/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


	public static void main(String[] args) {
		
		System.out.println("Se presiona el botón para subir");
		Boton subir = new BotonPiso(true, true);
		System.out.println(subir);
		System.out.println("llega el ascensor....");
		System.out.println("Se apaga la luz del boton subir");
		subir.setIluminado(false);
		subir.setPresionado(false);
		System.out.println(subir);
		System.out.println("Se abren las puertas del piso");
		System.out.println("Se abren las puertas del ascensor");
		System.out.println("Entra la persona al ascensor");
		System.out.println("Presiona en piso 5");
		Boton piso5 = new BotonAscensor(true, true);
		System.out.println(piso5);
		System.out.println("Se cierran las puertas del ascensor");
		System.out.println("Se cierran las puertas del piso");
		System.out.println("Ascensor subiendo......");
		System.out.println("Alguien presiona botón alarma");
		System.out.println(piso5.emitirSonido());
		
		
	}
}
    

