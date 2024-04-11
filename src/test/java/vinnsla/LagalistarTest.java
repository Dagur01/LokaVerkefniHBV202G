package vinnsla;

import is.vinnsla.Lagalistar;
import is.vinnsla.Lagalisti;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LagalistarTest {

    @Test
    public void testFrumstilla(){
        Lagalistar.frumstilla();
        Lagalisti current = Lagalistar.getNuverandi();
        assertNotNull(current);
    }

    @Test
    public void testSetIndex(){
        Lagalistar.frumstilla();
        int expectedIndex = 1;
        Lagalistar.setIndex(expectedIndex);
        Lagalisti current = Lagalistar.getNuverandi();
        Lagalisti expected = Lagalistar.listar[expectedIndex];
        assertEquals(expected, current);
    }

    @Test
    public void testFrumstillaWithException(){
        String expectedMessage = Lagalistar.SKRA_FANNST_EKKI + "0";
        Exception exception = assertThrows(RuntimeException.class, ()-> Lagalistar.frumstilla());
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    public static void main(String[] args) {

    }
}
