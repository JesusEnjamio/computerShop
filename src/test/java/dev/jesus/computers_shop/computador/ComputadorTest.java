package dev.jesus.computers_shop.computador;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputadorTest {
    @Test
    public void testCrearComputador() {
        Computador computador = new Computador("Dell", 16, "Intel i7", "Windows 10", 1200.0);
        assertEquals("Dell", computador.getMarca());
        assertEquals(16, computador.getMemoria());
        assertEquals("Intel i7", computador.getProcesador());
        assertEquals("Windows 10", computador.getSistemaOperativo());
        assertEquals(1200.0, computador.getPrecio());
    }

    @Test
    public void testToString() {
        Computador computador = new Computador("HP", 8, "AMD Ryzen 5", "Linux", 800.0);
        String expected = "Computador{marca='HP', memoria=8GB, procesador='AMD Ryzen 5', sistemaOperativo='Linux', precio=800.0$}";
        assertEquals(expected, computador.toString());
}
}