import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletoneTest {

    @DisplayName("Test INTENTOS")
    @Test
    public void testGetSetIntentos() {
        Singletone singletone = Singletone.getInstance();
        singletone.setIntentos(5);
        assertEquals(5, singletone.getIntentos());
    }
    @DisplayName("Test INTENTOS MÁXIMO")
    @Test
    public void testGetSetIntentosMax() {
        Singletone singletone = Singletone.getInstance();
        singletone.setIntentosMax(10);
        assertEquals(10, singletone.getIntentosMax());
    }
    @DisplayName("Test RONDA PARTIDA")
    @Test
    public void testGetSetRondaPartida() {
        Singletone singletone = Singletone.getInstance();
        singletone.setRondaPartida(3);
        assertSame(3, singletone.getRondaPartida());
    }
    @DisplayName("Test RONDA ACTUAL")

    @Test
    public void testGetSetRondaActual() {
        Singletone singletone = Singletone.getInstance();
        singletone.setRondaActual(2);
        assertEquals(2, singletone.getRondaActual());
    }
    @DisplayName("Test FALLOS")
    @Test
    public void testGetSetFallos() {
        Singletone singletone = Singletone.getInstance();
        singletone.setFallos(1);
        assertEquals(1, singletone.getFallos());
    }

    @DisplayName("Test RESPUESTA")
    @Test
    public void testGetSetRespuesta() {
        Singletone singletone = Singletone.getInstance();
        singletone.setRespuesta(5);
        assertEquals(5, singletone.getRespuesta());
    }

    @DisplayName("Test SINGLETONE")
    @Test
    public void testSingletone() {
        Singletone singletone = Singletone.getInstance();
        Singletone singletone2 = Singletone.getInstance();
        assertSame(singletone, singletone2);
    }
    @DisplayName("Test CLASS")
    @Test
    public void testGetClass() {
        Singletone singletone = Singletone.getInstance();
        assertEquals(Singletone.class, singletone.getClass());
    }


}