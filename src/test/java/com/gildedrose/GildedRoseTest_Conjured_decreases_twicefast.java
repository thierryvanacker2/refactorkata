package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest_Conjured_decreases_twicefast {

    @Test
    void Conjured_decreases_twicefast () {
        Item item = new Item("Conjured Mana Cake", 3, 6) ;
        Item item2 = new Item("Conjured Mana Cake", 3, 1) ;
        Item item3 = new Item("Conjured Mana Cake", 0, 6) ;
        new GildedRose(new Item[]{item, item2, item3}).updateQuality();

        /* Conjured items count down twice as fast*/
        assertEquals(4, item.quality);
        assertEquals(2, item.sellIn);
        /* Cannot be lower than 0 */
        assertEquals(0, item2.quality);
        /* if expored, should go down by 4 */
        assertEquals(2, item3.quality);
    }

}
