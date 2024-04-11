package vinnsla;


import is.vinnsla.Askrifandi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AskrifandiTest {

    @Test
    public void testNafnProperty(){
        String expectedNafn = "Test Nafn";
        Askrifandi askrifandi = new Askrifandi(expectedNafn);

        assertEquals(expectedNafn, askrifandi.getNafn());
        String newNafn = "New Test Nafn";
        askrifandi.setNafn(newNafn);

        assertEquals(newNafn, askrifandi.getNafn());
    }

    public static void main(String[] args) {

    }
}
