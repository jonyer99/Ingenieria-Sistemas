public class Impresion extends Producto {
    private String color;
    private Foto hoja;

    public Impresion(int numero, String color, Foto hoja) {

        super(numero);
        this.color = color;
        this.hoja = hoja;
    };

}
