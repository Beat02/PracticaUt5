package cuteCats;

public class Gato {
    protected String nombre;
    protected String etapa;
    protected String color;

    public Gato(String nombre, String etapa, String color) {
        this.nombre = nombre;
        this.etapa=etapa;
        this.color = color;
    }
    public  void miau(String color){
        if (color.equalsIgnoreCase(Constante.COLORNARANJA)) {
            System.out.println("MIIIIIAAAAAUUUUUUU (está mirando a una esquina, probablemente haya un fantasma)");
        } else if (color.equalsIgnoreCase(Constante.COLORBLANCO)) {
            System.out.println("miauuu (con acento francés)");
        } else if (color.equalsIgnoreCase(Constante.COLORNEGRO)) {
            System.out.println("MrrrIIIrrrAArrrUUU (te trae un juguete para que se lo lances)");
        } else if (color.equalsIgnoreCase(Constante.COLORCAREY)) {
            System.out.println("miiiiiiaaaaauuuu miaaaaaaaauuuuu (te está pidiendo comida)");
        }else {
            System.out.println("ฅ^•ﻌ•^ฅ");
        }
    }
    public void zoomies(String etapa){
        if (etapa.equalsIgnoreCase(Constante.LITTLEBABY)){
            System.out.println("Tu gatito tiene tanta energía que ha tirado el jarrón de la mesa, y un par de tazas");
        } else if (etapa.equalsIgnoreCase(Constante.BABY)) {
            System.out.println("No te sorprendas si te salta encima alguna que otra noche, sigué siendo un bebé");
        } else if (etapa.equalsIgnoreCase(Constante.BIGBABY)) {
            System.out.println("No importa lo mayor que sea, los treats le siguen dando zoomies");
        }
    }
    public void
}
