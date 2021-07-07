package prog2.examen.entities;

import java.time.LocalDateTime;

public class PartidaVacuna implements Comparable<PartidaVacuna> {

    private LocalDateTime fecha;

    private TipoVacuna tipo;

    private int cantidad;

    private LocalDateTime vencimiento;

    public PartidaVacuna(LocalDateTime fecha, TipoVacuna tipo, int cantidad, LocalDateTime vencimiento) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.vencimiento = vencimiento;
    }

    public void vacunar() {
        this.cantidad--;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public TipoVacuna getTipo() {
        return tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDateTime getVencimiento() {
        return vencimiento;
    }

    @Override
    public int compareTo(PartidaVacuna o) {
        return this.vencimiento.compareTo(o.getVencimiento());
    }
}
