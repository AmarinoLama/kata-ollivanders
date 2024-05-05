package com.gildedrose;

public class Backstage extends Item {

    Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateItem() {
        updateSellIn();
        updateQuality();
    }

    public void updateQuality() {
        if (sellIn > 10) {
            quality = quality + 1;
        }

        if (sellIn < 11) {
            if (quality < 50) {
                quality = quality + 2;
            }
        }

        if (sellIn < 6) {
            if (quality < 50) {
                quality = quality + 3;
            }
        }

        if (sellIn == 0) {
            quality = 0;
        }
    }

    void updateSellIn() {
        if (sellIn > 0) {
            sellIn = sellIn - 1;
        }
    }
}
