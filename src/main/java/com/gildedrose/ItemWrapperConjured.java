package com.gildedrose;

public class ItemWrapperConjured extends ItemWrapper {
    public static final String Conjured = "Conjured Mana Cake";

    public ItemWrapperConjured(Item item) {
        super(item);
    }


    @Override
    protected void updateQuality() {
        qualityDown();
        qualityDown();
    }
}
