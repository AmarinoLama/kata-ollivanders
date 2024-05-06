package com.gildedrose;

public class Backstage extends Item {

    Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateItem() {
        updateSellIn();
        updateQuality();
    }

    void updateQuality() {



        if (sellIn > 10) {
            quality = quality + 1;
        }

        if (sellIn < 11 && sellIn > 5) {
            if (quality < 49) {
                quality = quality + 2;
            } else {
                quality = 50;
            }
        }

        if (sellIn < 6) {
            if (quality < 48) {
                quality = quality + 3;
            } else {
                quality = 50;
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
