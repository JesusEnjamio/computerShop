package dev.jesus.computers_shop.tienda;

import dev.jesus.computers_shop.computador.Computador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class TiendaTest {
    @Test
    public void testAgregarComputador() {
        Tienda tienda = new Tienda("TechStore", "John Doe", "ID123456789");
        Computador computador = new Computador("Dell", 16, "Intel i7", "Windows 10", 1200.0);

        tienda.agregarComputador(computador);
        assertEquals(1, tienda.listarComputadores().size());
    }

    @Test
    public void testEliminarComputador() {
        Tienda tienda = new Tienda("TechStore", "John Doe", "ID123456789");
        Computador computador = new Computador("Dell", 16, "Intel i7", "Windows 10", 1200.0);

        tienda.agregarComputador(computador);
        assertTrue(tienda.eliminarComputador("Dell"));
        assertEquals(0, tienda.listarComputadores().size());
    }

    @Test
    public void testBuscarComputador() {
        Tienda tienda = new Tienda("TechStore", "John Doe", "ID123456789");
        Computador computador = new Computador("Dell", 16, "Intel i7", "Windows 10", 1200.0);

        tienda.agregarComputador(computador);
        assertNotNull(tienda.buscarComputador("Dell"));
        assertNull(tienda.buscarComputador("HP"));
    }

    @Test
    public void testListarComputadores() {
        Tienda tienda = new Tienda("TechStore", "John Doe", "ID123456789");
        Computador computador1 = new Computador("Dell", 16, "Intel i7", "Windows 10", 1200.0);
        Computador computador2 = new Computador("HP", 8, "AMD Ryzen 5", "Linux", 800.0);

        tienda.agregarComputador(computador1);
        tienda.agregarComputador(computador2);

        List<Computador> lista = tienda.listarComputadores();
        assertEquals(2, lista.size());
        assertTrue(lista.contains(computador1));
        assertTrue(lista.contains(computador2));
    }
}
