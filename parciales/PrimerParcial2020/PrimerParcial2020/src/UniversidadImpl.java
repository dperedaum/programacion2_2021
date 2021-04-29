import entities.Evaluacion;
import entities.Profesor;
import entities.Respuesta;
import entities.VideoClase;
import exceptions.EntidadNoExiste;
import exceptions.EntidadYaExiste;
import exceptions.InformacionInvalida;
import uy.edu.um.adt.linkedlist.MyLinkedListImpl;
import uy.edu.um.adt.linkedlist.MyList;
import uy.edu.um.adt.queue.EmptyQueueException;

public class UniversidadImpl implements UniversidadMgt {

    private MyList<Profesor> profesores = new MyLinkedListImpl<>();

    private Profesor buscarProfesor(int cedula) {
        boolean encontre = false;
        Profesor profesor = null;
        int i = 0;
        while (!encontre && i < profesores.size()) {
            if (profesores.get(i).getCedula() == cedula) {
                encontre = true;
                profesor = profesores.get(i);
            }
            i++;
        }

        return profesor;
    }

    @Override
    public void crearProfesor(int cedula, String nombre) throws EntidadYaExiste {
        Profesor profe = new Profesor(cedula, nombre);

        if (buscarProfesor(cedula) != null) {
            throw new EntidadYaExiste();
        }

        profesores.add(profe);
    }

    @Override
    public void agregarVideoClase(int cedulaProfesor, String urlVideo) throws EntidadNoExiste, EntidadYaExiste {
        Profesor profe = buscarProfesor(cedulaProfesor);

        if (profe == null) {
            throw new EntidadNoExiste();
        }

        if (profe.buscarVideo(urlVideo) != null) {
            throw new EntidadYaExiste();
        }

        VideoClase video = new VideoClase(urlVideo);
        profe.getVideos().add(video);
    }

    @Override
    public void agregarEvaluacionAVideo(int cedulaProfesorEvaluado, String urlVideo, int cedulaProfesorEvaluador, int puntaje, String comentario) throws InformacionInvalida {
        Profesor profeEvaluado = buscarProfesor(cedulaProfesorEvaluado);
        VideoClase videoAEvaluar = profeEvaluado.buscarVideo(urlVideo);

        Profesor profeEvaluador = buscarProfesor(cedulaProfesorEvaluador);

        if (profeEvaluado == null || videoAEvaluar == null || profeEvaluador == null) {
            throw new InformacionInvalida();
        }

        profeEvaluado.crearEvaluacion(profeEvaluador, videoAEvaluar, puntaje, comentario);
    }

    @Override
    public Evaluacion obtenerEvaluacionAProcesar(int cedulaProfesorEvaluado) {
        Profesor profe = buscarProfesor(cedulaProfesorEvaluado);

        Evaluacion temp = null;

        try {
            temp = profe.obtenerProximaEvaluacionAProcesar();
        } catch (EmptyQueueException e) {
            // Nada que hacer
        }

        return temp;
    }

    @Override
    public void registrarRespuesta(int cedulaProfesorEvaluado, Evaluacion eval, boolean aceptado, String comentario) {
        Profesor profe = buscarProfesor(cedulaProfesorEvaluado);

        Respuesta respuesta = new Respuesta(aceptado, comentario);
        eval.setRespuesta(respuesta);

        profe.getProcesadas().add(eval);
    }

    @Override
    public MyList<Evaluacion> obtenerEvaluacionesProcesadas(int cedulaProfesorEvaluado) {
        return buscarProfesor(cedulaProfesorEvaluado).getProcesadas();
    }
}
