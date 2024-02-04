package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest_sellbypassed_twice_decrease {

    @Test
    void sellbypassed_twice_decrease() {
        Item normalItem = new Item("5 Dexterity Vest", 0, 20);
        Item normalItem2 = new Item("5 Dexterity Vest", 1, 20);
        new GildedRose(new Item[]{normalItem, normalItem2}).updateQuality();

        /* Decrease by 2 since sellby has passed */
        assertEquals(normalItem.quality, 18);
        /* Decrease by 1 */
        assertEquals(normalItem2.quality, 19);
    }

}
