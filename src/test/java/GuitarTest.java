import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Electric", 6);
    }

    @Test
    public void canPlay() {
        assertEquals("Twang", guitar.play());
    }
}
