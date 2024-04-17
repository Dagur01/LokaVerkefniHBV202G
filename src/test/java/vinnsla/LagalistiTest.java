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

    private Lagalisti lagalisti;

    @Test
    public void testLesaLog(){
        this.lagalisti = new Lagalisti();
        try {
            lagalisti.lesaLog("test.txt");
            assertFalse(lagalisti.getListi().isEmpty());
        } catch (IOException e) {

        }
    }

    @Test
    public void testNaesti() {
        this.lagalisti = new Lagalisti();
        lagalisti.getListi().addAll(new Lag("path1", "image1.jpg", "Song1", 300),
                new Lag("path2", "image2.jpg", "Song2", 200));

        lagalisti.naesti();
        assertEquals(1, lagalisti.getIndex());

        lagalisti.naesti();
        assertEquals(0, lagalisti.getIndex());
    }

    @Test
    public void testGettersSetters() {
        this.lagalisti = new Lagalisti();
        lagalisti.setIndex(2);
        assertEquals(2, lagalisti.getIndex());
    }
}
