package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgedBrieTest {

    @Test
    public void testUpdateItem() {
        AgedBrie item = new AgedBrie("Aged Brie", 10, 10);
        item.updateItem();
        assertEquals(11, item.quality);
        assertEquals(9, item.sellIn);
    }

    @Test
    public void testUpdateItemSellInPassed() {
        AgedBrie item = new AgedBrie("Aged Brie", 0, 10);
        item.updateItem();
        assertEquals(12, item.quality);
        assertEquals(0, item.sellIn);
    }
}