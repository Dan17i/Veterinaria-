/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.Enum.Especie;
import co.edu.uniquindio.poo.Enum.Genero;

/**
 * Unit test for simple App.
 */
public class Veterinaria {
    private static final Logger LOG = Logger.getLogger(Veterinaria.class.getName());


    /**
     * Rigorous Test :-)
     */
    @Test
    public void DatosCompletos() {

        LOG.info("Iniciado test de Datos Completos");

        Veterinaria veterinaria = new Veterinaria ("Bob", Especie.VERTEBRADOS, "Bulldog Ingles", (byte)2, Genero.MACHO, "Blanco", 18.6f);
        
        assertEquals("Bob",veterinaria.getNombre()));
        assertEquals("Bob",veterinaria.getNombre());
        assertEquals("VETEBRADOS", Especie.VERTEBRADOS.name());
        assertEquals("Bulldog Ingles", veterinaria.getRaza());
        assertEquals((byte)2, veterinaria.getEdad());
        assertEquals("MACHO", Genero.MACHO.name());
        assertEquals("Blanco", veterinaria.getColor());
        assertEquals(18.6f, veterinaria.getPeso());

        LOG.info("Iniciando test de Datos completos");

        LOG.info("Finalizando test Datos Completados");
    }


    @Test
    public void DatosNull(){
        LOG.info("Iniciado test de Datos Null");

        assertThrows(Throwable.class, () -> new Veterinaria(null, null, null, (byte)0, null, null, 0));
        LOG.info("Finalizando test datos null");
    }


    @Test
    public void DatosVacios() {
        LOG.info("Iniciado test de Datos vacios ");

        assertThrows(Throwable.class, () -> new Veterinaria("","", (byte)0,"", 0));

        LOG.info("Finalizando test datos vacios");
    }
     
    @Test
    public void EdadNegativa(){
        assertThrows(Throwable.class, ()-> new Veterinaria("Bob", Especie.VERTEBRADOS, "Bulldog Ingles", (byte)-2, Genero.MACHO, "Blanco", 18.6f));
    }

    @Test
    public void PesoNegativa(){
        assertThrows(Throwable.class, ()-> new Veterinaria("Bob", Especie.VERTEBRADOS, "Bulldog Ingles", (byte)2, Genero.MACHO, "Blanco", -18.6f));
    }

}