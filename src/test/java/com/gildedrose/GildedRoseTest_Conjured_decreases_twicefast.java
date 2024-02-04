package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest_Conjured_decreases_twicefast {

    @Test
    void Conjured_decreases_twicefast () {
        Item item = new Item("Conjured Mana Cake", 3, 6) ;
        new GildedRose(new Item[]{item}).updateQuality();

        /* Sulfuras never decreases in quality and does not count down*/
        assertEquals(4, item.quality);
        assertEquals(2, item.sellIn);
    }

}
