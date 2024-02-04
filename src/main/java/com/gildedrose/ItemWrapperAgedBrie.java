package com.gildedrose;

public class ItemWrapperAgedBrie extends ItemWrapper {
    public static final String AGED_BRIE = "Aged Brie";

    public ItemWrapperAgedBrie(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        qualityUp();
    }

    @Override
    protected void sellInExpired() {
            qualityUp();
    }
}
