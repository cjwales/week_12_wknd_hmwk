import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Yamaha", "Wood", "Black", 88, "Grand");
    }

    @Test
    public void canPlay() {
        assertEquals("Tinkle", piano.play());
    }

    @Test
    public void canGetMake() {
        assertEquals("Yamaha", piano.getMake());
    }
}
