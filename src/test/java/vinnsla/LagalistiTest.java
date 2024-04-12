package vinnsla;

import is.vinnsla.Lag;
import is.vinnsla.Lagalisti;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static javafx.beans.binding.Bindings.when;
import static org.junit.Assert.*;

public class LagalistiTest {

    private Lagalisti lagalisti = new Lagalisti();
    protected ObservableList<Lag> listi = FXCollections.observableArrayList();

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Before
    public void setUp() {
        lagalisti = new Lagalisti();
    }

    @Test
    public void testLesaLog() throws IOException {
        System.out.println (System.getProperty("user.dir"));
        File file = new File (System.getProperty("user.dir")+"/src/main/resources/is/vinnsla/");
        Scanner scanner = new Scanner(file, StandardCharsets.UTF_8);
        String [] lina;
        try {
            // lesa gögn ur skrá og búa til Lag hlut
            while (scanner.hasNextLine()) {

                lina = scanner.nextLine().split(" ");
                listi.add(new Lag (lina[0], lina [3], lina[1], Integer.parseInt(lina[2])));
            }
            scanner.close();
        }catch (RuntimeException e) {
            e.printStackTrace();
        }

        File testFile = folder.newFile("testSongs.txt");
        try (PrintWriter out = new PrintWriter(testFile, StandardCharsets.UTF_8.name())) {
            out.println("path/to/media1 song1.jpg SongName1 180");
            out.println("path/to/media2 song2.jpg SongName2 240");
        }

        // Simulate user directory and file structure expected by the method
        String oldUserDir = System.getProperty("user.dir");
        try {
            System.setProperty("user.dir", folder.getRoot().getPath());

            lagalisti.lesaLog("testSongs.txt");

            assertEquals("Expected list size after reading file", 2, lagalisti.getListi().size());
            assertEquals("Check name of first song", "SongName1", lagalisti.getListi().get(0).getNafn());
            assertEquals("Check length of first song", 180, lagalisti.getListi().get(0).getLengd());
        } finally {
            // Restore the original user.dir property to avoid side effects
            System.setProperty("user.dir", oldUserDir);
        }
    }

    @Test
    public void testNaesti() {
        lagalisti.getListi().addAll(new Lag("path1", "image1.jpg", "Song1", 300),
                new Lag("path2", "image2.jpg", "Song2", 200));

        lagalisti.naesti();
        assertEquals(1, lagalisti.getIndex());

        lagalisti.naesti();
        assertEquals(0, lagalisti.getIndex());
    }

    @Test
    public void testGettersSetters() {
        lagalisti.setIndex(2);
        assertEquals(2, lagalisti.getIndex());
    }
}
