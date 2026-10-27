public class Foto {
    private Stirng fichero

    public Foto(Stirng fichero) {
        this.fichero = fichero;
    }

    public Stirng getFichero() {
        return fichero;
    };
    public void print(){
        System.out.println("Imprimiendo foto:" + fichero);
    }
    
    
}
