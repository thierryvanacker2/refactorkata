package com.gildedrose;

public class ItemWrapperBackstagePasses extends ItemWrapper {
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";

    public ItemWrapperBackstagePasses(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        if (this.item.quality < 50) {
            item.quality = item.quality + 1;
            if (item.sellIn < 11) {
                qualityUp();
            }

            if (item.sellIn < 6) {
                qualityUp();
            }
        }
    }

    @Override
    protected void sellInExpired() {
            item.quality = 0;
    }
}
