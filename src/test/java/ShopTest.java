import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;

    @Before
    public void before() {
        shop = new Shop();
        piano = new Piano("Yamaha", "Wood", "Black", 88, "Upright", "Piano", 50, 75);
    }

    @Test
    public void canAddItemsToStock() {
        shop.addItemToStock(piano);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void canRemoveItemsFromStock() {
        shop.removeItemFromStock(piano);
        assertEquals(0, shop.getStockSize());
    }
}
