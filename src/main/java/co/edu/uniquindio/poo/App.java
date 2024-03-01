package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.Enum.Especie;
import co.edu.uniquindio.poo.Enum.Genero;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Veterinaria veterinaria = new Veterinaria ("Bob", Especie.VERTEBRADOS, "Bulldog Ingles", (byte)2,
         Genero.MACHO, "Blanco", 18.6f);
         
        System.out.println(veterinaria.toString());
    }
}
