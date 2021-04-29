package entities;

public class Evaluacion {

    private int puntaje;

    private String comentario;

    private VideoClase video;
    
    private Respuesta respuesta;

    private Profesor profesorEvaluador;

    public Evaluacion(int puntaje, String comentario, Profesor evaluador, VideoClase video) {
        this.puntaje = puntaje;
        this.comentario = comentario;
        this.video = video;
        this.profesorEvaluador = evaluador;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public String getComentario() {
        return comentario;
    }

    public Respuesta getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Respuesta respuesta) {
        this.respuesta = respuesta;
    }

    public Profesor getProfesorEvaluador() {
        return profesorEvaluador;
    }

    public VideoClase getVideo() {
        return video;
    }
}
