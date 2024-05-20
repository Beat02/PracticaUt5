package cuteCats;

public abstract class Gato {
    protected String nombre;
    protected String etapa;
    protected String color;

    public Gato(String nombre, String etapa, String color) {
        this.nombre = nombre;
        this.etapa=etapa;
        this.color = color;
    }
    public abstract void miau(String color);
    public void zoomies(String etapa){
        if (etapa.equalsIgnoreCase(Constante.LITTLEBABY)){
            System.out.println();
        } else if (etapa.equalsIgnoreCase(Constante.BABY)) {

        } else if (etapa.equalsIgnoreCase(Constante.BIGBABY)) {

        }
    }
}
