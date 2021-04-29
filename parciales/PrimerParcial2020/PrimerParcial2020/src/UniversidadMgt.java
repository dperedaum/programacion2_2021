import entities.Evaluacion;
import exceptions.EntidadNoExiste;
import exceptions.EntidadYaExiste;
import exceptions.InformacionInvalida;
import uy.edu.um.adt.linkedlist.MyList;

public interface UniversidadMgt {

    void crearProfesor(int cedula, String nombre) throws EntidadYaExiste;

    void agregarVideoClase(int cedulaProfesor, String urlVideo)
            throws EntidadNoExiste, EntidadYaExiste;

    void agregarEvaluacionAVideo(int cedulaProfesorEvaluado, String urlVideo, int cedulaProfesorEvaluador,
                                 int puntaje, String comentario) throws InformacionInvalida;

    Evaluacion obtenerEvaluacionAProcesar(int cedulaProfesorEvaluado);

    void registrarRespuesta(int cedulaProfesorEvaluado, Evaluacion eval, boolean aceptado, String comentario);

    MyList<Evaluacion> obtenerEvaluacionesProcesadas(int cedulaProfesorEvaluado);
}
