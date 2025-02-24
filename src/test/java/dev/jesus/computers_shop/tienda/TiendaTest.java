package dev.jesus.computers_shop.tienda;

import dev.jesus.computers_shop.computador.Computador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TiendaTest {
    @Test
    public void testAgregarComputador() {
        Tienda tienda = new Tienda("TechStore", "John Doe", "ID123456789");
        Computador computador = new Computador("Dell", 16, "Intel i7", "Windows 10", 1200.0);

        tienda.agregarComputador(computador);
        assertEquals(1, tienda.listarComputadores().size());
    }
}
