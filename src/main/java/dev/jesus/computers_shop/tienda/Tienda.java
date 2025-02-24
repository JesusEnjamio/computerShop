package dev.jesus.computers_shop.tienda;
import dev.jesus.computers_shop.computador.Computador;
import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private String propietario;
    private String identificadorTributario;
    private List<Computador> computadores;

    public Tienda(String nombre, String propietario, String identificadorTributario) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.identificadorTributario = identificadorTributario;
        this.computadores = new ArrayList<>();
    }

    public void agregarComputador(Computador computador) {
        computadores.add(computador);
    }

    public List<Computador> listarComputadores() {
        return new ArrayList<>(computadores);
    }
}
