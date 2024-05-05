package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackstageTest {
    @Test
    void updateItem() {
        Backstage backstage = new Backstage("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        backstage.updateItem();
        assertEquals(21, backstage.quality);
        assertEquals(14, backstage.sellIn);
    }

    @Test
    void updateItemTwo() {
        Backstage backstage = new Backstage("Backstage passes to a TAFKAL80ETC concert", 9, 20);
        backstage.updateItem();
        assertEquals(22, backstage.quality);
        assertEquals(8, backstage.sellIn);
    }

    @Test
    void updateItemThree() {
        Backstage backstage = new Backstage("Backstage passes to a TAFKAL80ETC concert", 4, 20);
        backstage.updateItem();
        assertEquals(23, backstage.quality);
        assertEquals(3, backstage.sellIn);
    }

    @Test
    void updateItemFour() {
        Backstage backstage = new Backstage("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        backstage.updateItem();
        assertEquals(0, backstage.quality);
        assertEquals(0, backstage.sellIn);
    }
}