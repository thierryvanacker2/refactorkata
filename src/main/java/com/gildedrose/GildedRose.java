package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    /* this name should be something like dailyHandleItems, did not change it
     * because it is a public method and no knowledge of who is using this
     */
    public void updateQuality() {
        for (Item item : items) {
            ItemWrapperFactory.createItemWrapper(item).handleItem();
        }
    }

}
