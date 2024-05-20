package cuteCats;

import java.util.Scanner;

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

    public static void crearGato(String nombre) {
        Gato gatito = new Gato(nombre);
        System.out.println(gatito.toString());
        gatito.miau(gatito.getColor());
        gatito.zoomies(gatito.getEtapa());

    }
    public static void finPrograma(int numeroGatos){
        System.out.println("Disfruta de tus gatitos");
        for (int i = 0; i < numeroGatos; i++) {
            System.out.println("/ᐠ - ˕ -マ Ⳋ");
        }
    }
}
