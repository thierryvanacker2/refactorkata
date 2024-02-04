package com.gildedrose;

public class ItemWrapperFactory {

        public static ItemWrapper createItemWrapper(Item item){
            switch (item.name) {
                case ItemWrapperAgedBrie.AGED_BRIE:
                    return new ItemWrapperAgedBrie(item);
                case ItemWrapperBackstagePasses.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT:
                    return new ItemWrapperBackstagePasses(item);
                case ItemWrapperSulfuras.SULFURAS_HAND_OF_RAGNAROS:
                    return new ItemWrapperSulfuras(item);
                case ItemWrapperConjured.Conjured:
                    return new ItemWrapperConjured(item);
                default:
                    return new ItemWrapper(item);
            }
        }

}
