package entities;

public class Respuesta {

    private boolean aceptado;

    private String comentario;

    public Respuesta(boolean aceptado, String comentario) {
        this.aceptado = aceptado;
        this.comentario = comentario;
    }

    public boolean isAceptado() {
        return aceptado;
    }

    public String getComentario() {
        return comentario;
    }
}
