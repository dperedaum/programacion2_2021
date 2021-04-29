import exceptions.EntidadNoExiste;
import exceptions.EntidadYaExiste;
import org.junit.Test;
import static org.junit.Assert.*;
public class UniversidadImplTest {

    @Test
    public void testGeneral() {
        UniversidadMgt universidad = new UniversidadImpl();

        try {
            universidad.crearProfesor(1, "Daniel");
            universidad.crearProfesor(2, "Jose");

            assertTrue(true);

        } catch (EntidadYaExiste entidadYaExiste) {
            assertTrue(false);
        }

        try {
            universidad.agregarVideoClase(1, "video1");
            universidad.agregarVideoClase(2, "video2");
        } catch (EntidadNoExiste entidadNoExiste) {
            entidadNoExiste.printStackTrace();
        } catch (EntidadYaExiste entidadYaExiste) {
            entidadYaExiste.printStackTrace();
        }

        // chequeo de flujo alternativo
        try {
            universidad.agregarVideoClase(4, "video2");
            fail();
        } catch (EntidadNoExiste entidadNoExiste) {
            assertTrue(true);
        } catch (EntidadYaExiste entidadYaExiste) {
            fail();
        }
    }
}
