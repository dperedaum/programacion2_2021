package prog2.examen.entities;

import java.util.Objects;

public class Persona {

    private long cedula;

    private PartidaVacuna partidaVacuna;

    public Persona(long cedula) {
        this.cedula = cedula;
    }

    public PartidaVacuna getPartidaVacuna() {
        return partidaVacuna;
    }

    public void setPartidaVacuna(PartidaVacuna partidaVacuna) {
        this.partidaVacuna = partidaVacuna;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return cedula == persona.cedula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula);
    }
}
