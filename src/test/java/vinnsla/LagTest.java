package vinnsla;

import is.vinnsla.Lag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LagTest {

    @Test
    public void testConstructorAndGetters() {
        String expectedMedia = "path/to/media";
        String expectedMynd = "image.jpg";
        String expectedNafn = "Song Name";
        int expectedLengd = 300;

        Lag lag = new Lag(expectedMedia, expectedMynd, expectedNafn, expectedLengd);

        assertEquals(expectedMedia, lag.getMedia());
        assertEquals(expectedMynd, lag.getMynd());
        assertEquals(expectedNafn, lag.getNafn());
        assertEquals(expectedLengd, lag.getLengd());
    }

    @Test
    public void testToString() {
        String expectedName = "Song Name";
        Lag lag = new Lag("path/to/media", "image.jpg", expectedName, 300);

        assertEquals(expectedName, lag.toString());
    }

}
