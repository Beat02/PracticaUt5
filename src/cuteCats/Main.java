package cuteCats;

import java.util.Scanner;

/**
 * <strong>@author beatr</strong>
 * @see @Gato
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroGatos;
        System.out.println("Bienvenide, por fín has conseguido tu objetivo en la vida, ser la señora de los gatos" +
                '\n' + "Dime, ¿cuantos gatos quieres tener?");
        numeroGatos = teclado.nextInt();
        for (int i = 0; i < numeroGatos; i++) {
            System.out.println("Dime como quieres llamar a tu gatito:");
            String nombre = teclado.next();
            crearGato(nombre);
        }
        finPrograma(numeroGatos);
    }

    /**
     *Nos imprime por pantalla toda la info del gato creado
     * @param nombre elegido por usuario para poder crear un objeto de Gato
     * @see Gato
     */
    public static void crearGato(String nombre) {
        Gato gatito = new Gato(nombre);
        System.out.println(gatito.toString());
        gatito.miau(gatito.getColor());
        gatito.zoomies(gatito.getEtapa());

    }

    /**
     *Imprime por pantalla la despedida del programa
     * @param numeroGatos para imprimirte tantos gatos como los que haya querido crear el usuario
     *
     */
    public static void finPrograma(int numeroGatos){
        System.out.println("Disfruta de tus gatitos");
        for (int i = 0; i < numeroGatos; i++) {
            System.out.println("≽^•⩊•^≼");
        }
    }
}
