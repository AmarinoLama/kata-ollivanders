package com.gildedrose;

public class NormalItem extends Item {

    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateItem() {
        updateSellIn();
        updateQuality();
    }

    private void updateQuality() {
        if (quality > 0 && sellIn > 0) {
            quality = quality - 1;
        } else {
            quality = quality - 2;
        }

    }

    private void updateSellIn() {
        if (sellIn > 0) {
            sellIn = sellIn - 1;
        }
    }
}
