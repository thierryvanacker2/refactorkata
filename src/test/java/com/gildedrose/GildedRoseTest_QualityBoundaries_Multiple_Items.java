package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest_QualityBoundaries_Multiple_Items {

    @Test
    void sellbypassed_QualityBoundaries_Multiple_Items() {

        Item Item = new Item("Aged Brie", 12, 50);
        Item Item2 = new Item("Item 2", 12, 50);
        Item Item3 = new Item("Sulfuras, Hand of Ragnaros", 12, 50);
        Item Item4 = new Item("5 Dexterity Vest", 0, 0);
        new GildedRose(new Item[]{Item, Item2, Item3, Item4}).updateQuality();

        /* Aged Brie increases quality, it should not exceed 50 */
        assertEquals(50, Item.quality);
        /* Normal Items go down in quality */
        assertEquals(49, Item2.quality);
        /* Sulfuras never decreases in quality */
        assertEquals(50, Item3.quality);
        /* Quality cannot go negative */
        assertEquals(0, Item4.quality);
    }

}
