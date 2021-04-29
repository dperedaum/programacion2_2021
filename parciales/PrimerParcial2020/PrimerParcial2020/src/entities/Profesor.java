package entities;

import uy.edu.um.adt.linkedlist.MyLinkedListImpl;
import uy.edu.um.adt.linkedlist.MyList;
import uy.edu.um.adt.queue.EmptyQueueException;
import uy.edu.um.adt.queue.MyQueue;

public class Profesor {

    private int cedula;

    private String nombre;

    private MyQueue<Evaluacion> pendientes = new MyLinkedListImpl();

    private MyList<Evaluacion> procesadas = new MyLinkedListImpl();

    private MyList<VideoClase> videos = new MyLinkedListImpl<>();

    public Profesor(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public VideoClase buscarVideo(String urlVideo) {
        boolean encontre = false;
        VideoClase video = null;
        int i = 0;
        while (!encontre && i < videos.size()) {
            if (videos.get(i).getUrl().equals(urlVideo)) {
                encontre = true;
                video = videos.get(i);
            }
            i++;
        }

        return video;
    }

    public void crearEvaluacion(Profesor profesorEvaluador, VideoClase videoAEvaluar, int puntaje, String comentario) {
        Evaluacion evaluacion = new Evaluacion(puntaje, comentario, profesorEvaluador, videoAEvaluar);
        pendientes.enqueueWithPriority(evaluacion, puntaje);
    }

    public Evaluacion obtenerProximaEvaluacionAProcesar() throws EmptyQueueException {
        return pendientes.dequeue();
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public MyQueue<Evaluacion> getPendientes() {
        return pendientes;
    }

    public MyList<Evaluacion> getProcesadas() {
        return procesadas;
    }

    public MyList<VideoClase> getVideos() {
        return videos;
    }
}
