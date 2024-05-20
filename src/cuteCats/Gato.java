package cuteCats;

public abstract class Gato {
    protected String nombre;
    protected String etapa;
    protected ColorGato color;

    public Gato(String nombre, String etapa, ColorGato color) {
        this.nombre = nombre;
        this.etapa=etapa;
        this.color = color;
    }
    public abstract void miau(ColorGato color);
    public void zoomies(String etapa){
        if (etapa.equalsIgnoreCase(Constante.LITTLEBABY)){

        } else if (etapa.equalsIgnoreCase(Constante.BABY)) {

        } else if (etapa.equalsIgnoreCase(Constante.BIGBABY)) {

        }
    }
}
