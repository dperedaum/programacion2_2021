package entidades;

import interfaces.GastoAnimal;

public class Animal implements GastoAnimal {

    private String nombre;

    private long gasto;

    public Animal(String nombre, long gasto) {
        this.nombre = nombre;
        this.gasto = gasto;
    }

    public long obtenerGastoAlimentacionAnual() {
        return this.gasto;
    }

    public long obtenerGastoAlimentarioAnual() {
        return this.gasto*2;
    }

    public String getNombre() {
        return this.nombre;
    }
}
