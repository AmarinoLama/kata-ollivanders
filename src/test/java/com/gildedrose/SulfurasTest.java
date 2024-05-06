package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SulfurasTest {

    @Test
    void updateItem() {
        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);
        sulfuras.updateItem();
        assertEquals(80, sulfuras.quality);
        assertEquals(0, sulfuras.sellIn);
    }

    @Test
    void updateItemnNegativeSellIn() {
        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80);
        sulfuras.updateItem();
        assertEquals(80, sulfuras.quality);
        assertEquals(-1
                , sulfuras.sellIn);
    }
}