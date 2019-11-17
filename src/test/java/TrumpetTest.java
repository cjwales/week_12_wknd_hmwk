import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("Getzen", "Brass", "Brass", 4, "Full", "Trumpet", 75, 112.50);
    }

    @Test
    public void canPlay() {
        assertEquals("Toot", trumpet.play());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void canGetMarkupAmount() {
        assertEquals(37.5, trumpet.calculateMarkup(), 0.0);
    }
}
