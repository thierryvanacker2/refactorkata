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
        assertEquals(Item.quality, 50);
        /* Normal Items go down in quality */
        assertEquals(Item2.quality, 49);
        /* Sulfuras never decreases in quality */
        assertEquals(Item3.quality, 50);
        /* Quality cannot go negative */
        assertEquals(Item4.quality, 0);
    }

}
