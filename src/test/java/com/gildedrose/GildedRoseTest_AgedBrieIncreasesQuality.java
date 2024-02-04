package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest_AgedBrieIncreasesQuality {

    @Test
    void sellbypassed_AgedBrieIncreasesQuality() {
        Item normalItem = new Item("Aged Brie", 12, 20);
        new GildedRose(new Item[]{normalItem}).updateQuality();

        assertEquals(normalItem.quality, 21);
    }

}
