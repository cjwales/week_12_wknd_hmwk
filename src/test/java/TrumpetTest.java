import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("Getzen", "Brass", "Brass", 4, "Full");
    }

    @Test
    public void canPlay() {
        assertEquals("Toot", trumpet.play());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Brass", trumpet.getMaterial());
    }
}
