package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest_BackStagePasses_increase_by_sellby {

    @Test
    void backStagePasses_increase_by_sellby() {
        Item Item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        Item Item2 = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49);
        Item Item3 = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49);
        Item Item4 = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 40);
        Item Item5 = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 40);
        Item Item6 = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 40);

        new GildedRose(new Item[]{Item, Item2, Item3, Item4, Item5, Item6}).updateQuality();

        /* Should go up by 1 since sellIn is > 10 */
        assertEquals(21, Item.quality);
        /* Should go up by 2 since sellIn is 10 but limited by 50 */
        assertEquals(50, Item2.quality);
        /* Should go up by 3 since sellIn is 5 but limited by 50 */
        assertEquals(50, Item3.quality);
        /* Should go up by 2 since sellIn is 10 */
        assertEquals(42, Item4.quality);
        /* Should go up by 3 since sellIn is 5  */
        assertEquals(43, Item5.quality);
        /* Should go to 0 since sellIn is 0  */
        assertEquals(0, Item6.quality);
    }

}
