package cuteCats;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <strong>@author beatr</strong>
 * @version 1.0
 */
public class Gato {
    protected String nombre;
    protected String etapa;
    protected String color;

    public String getNombre() {
        return nombre;
    }

    public String getEtapa() {
        return etapa;
    }

    public String getColor() {
        return color;
    }

    public Gato(String nombre) {
        this.nombre = nombre;
        this.etapa= RandomEtapa();
        this.color = RandomColor();
    }

    /**
     *Este método nos imprime como se comunica según su color
     * @param color, según color, el mensaje por pantalla es distinto
     */
    public  void miau(String color){
        if (color.equalsIgnoreCase(Constante.COLORNARANJA)) {
            System.out.println("MIIIIIAAAAAUUUUUUU (está mirando a una esquina, probablemente haya un fantasma)");
        } else if (color.equalsIgnoreCase(Constante.COLORBLANCO)) {
            System.out.println("miauuu (con acento francés)");
        } else if (color.equalsIgnoreCase(Constante.COLORNEGRO)) {
            System.out.println("MrrrIIIrrrAArrrUUU (te trae un juguete para que se lo lances)");
        } else {
            System.out.println("miiiiiiaaaaauuuu miaaaaaaaauuuuu (te está pidiendo comida)");
        }
    }

    /**
     *
     * Este metodo nos imprime por pantalla los zoomies del gato según su etapa
     * @param etapa según etapa de la vida, tendrá un nivel de energía u otro
     */
    public void zoomies(String etapa){
        if (etapa.equalsIgnoreCase(Constante.LITTLEBABY)){
            System.out.println("Tu gatito tiene tanta energía que ha tirado el jarrón de la mesa, y un par de tazas");
        } else if (etapa.equalsIgnoreCase(Constante.BABY)) {
            System.out.println("No te sorprendas si te salta encima alguna que otra noche, sigué siendo un bebé");
        } else if (etapa.equalsIgnoreCase(Constante.BIGBABY)) {
            System.out.println("No importa lo mayor que sea, los treats le siguen dando zoomies");
        }
    }

    /**
     *Hacemos un shuffle sobre la List con las etapas, y nos devuelve el primer String de la List
     * @return nos devuelve una etapa random de las constantes ya creadas
     */
    public String RandomEtapa(){
        List<String> etapas=new ArrayList<>();
        etapas.add(Constante.LITTLEBABY);
        etapas.add(Constante.BABY);
        etapas.add(Constante.BIGBABY);
        Collections.shuffle(etapas);
        String etapa=etapas.getFirst();
        return etapa;
    }

    /**
     *Hacemos un shuffle sobre la List con los colores, y nos devuelve el primer String de la List
      * @return nos devuelve un color random de las constantes ya creadas
     */
    public String RandomColor(){
        List<String> colores=new ArrayList<>();
        colores.add(Constante.COLORNARANJA);
        colores.add(Constante.COLORBLANCO);
        colores.add(Constante.COLORNEGRO);
        colores.add(Constante.COLORCAREY);
        Collections.shuffle(colores);
        String color=colores.getFirst();
        return color;
    }

    /**
     *Imprime por pantalla un maullido
     * @deprecated
     * Método superado por con mayor personalización
     * @see #miau(String)
     */
    public  void maullido(){
        System.out.println("miauuuu");
    }

    @Override
    public String toString() {
        return "Gato ฅ^•ﻌ•^ฅ" +"\n"+
                "nombre: " + nombre + '\n' +
                "etapa: " + etapa + '\n' +
                "color: " + color + '\n';
    }
}
