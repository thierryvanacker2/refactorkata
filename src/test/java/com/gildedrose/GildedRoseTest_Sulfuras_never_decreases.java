package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest_Sulfuras_never_decreases {

    @Test
    void sellbypassed_Sulfuras_never_decreases () {
        Item Item = new Item("Sulfuras, Hand of Ragnaros", 12, 80);
        Item Item2 = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        Item Item3 = new Item("Sulfuras, Hand of Ragnaros", -1, 80);
        new GildedRose(new Item[]{Item, Item2, Item3}).updateQuality();

        /* Sulfuras never decreases in quality and does not count down*/
        assertEquals(80, Item.quality);
        assertEquals(12, Item.sellIn);
        assertEquals(80, Item2.quality);
        assertEquals(0, Item2.sellIn);
        assertEquals(80, Item3.quality);
        assertEquals(Integer.valueOf(-1), Item3.sellIn);
    }

}
