import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @DisplayName("Test IniciarPartida")
    @Test
    public void testGenerarNumeroAleatorio() {
        Main main = new Main();
        main.IniciarPartida();
        int numeroAleatorio = main.GenerarNumeroAleatorio();
        assertTrue(numeroAleatorio >= 1 && numeroAleatorio <= 10);
    }
}