package com.gildedrose;

public class ItemWrapper {

    protected Item item;

    public ItemWrapper(Item item) {
        this.item = item;
    }

    public void handleItem() {
        updateQuality();
        updateSellIn();
        if (sellInIsExpired()) {
            sellInExpired();
        }
    }

    protected void updateQuality() {
        qualityDown();
    }

    protected void updateSellIn() {
        item.sellIn--;
    }

    protected void sellInExpired() {
        qualityDown();
    }

    private boolean sellInIsExpired() {
        return item.sellIn < 0;
    }

    protected void qualityDown() {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    protected void qualityUp() {
        if (item.quality < 50) {
            item.quality++;
        }
    }
}
