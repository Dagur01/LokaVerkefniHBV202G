package vinnsla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LagTest {

    private String nafn = "test";
    private String media = "media";
    private int lengd = 1;
    private String mynd = "mynd";

    @Test
    public void testToString(){
        this.nafn="test";
        assertTrue(nafn.equals("test"));
    }

    @Test
    public void testGetMedia() {
        assertTrue(media.equals("media"));
    }

    @Test
    public void testGetNafn(){
        assertTrue(nafn.equals("test"));
    }

    @Test
    public void testGetMynd(){
        assertTrue(mynd.equals("mynd"));
    }

    @Test
    public void testGetLengd(){
        assertTrue(lengd==1);
        assertFalse(lengd!=1);

    }

}
