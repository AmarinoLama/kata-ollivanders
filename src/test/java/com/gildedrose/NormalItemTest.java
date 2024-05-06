package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalItemTest {

    @Test
    public void testCreateNormalItem() {
        NormalItem normalItem = new NormalItem("Elixir of gus", 10, 20);
        assertEquals("Elixir of gus", normalItem.name);
        assertEquals(10, normalItem.sellIn);
        assertEquals(20, normalItem.quality);
    }

    @Test
    public void testUpdateItem() {
        NormalItem normalItem = new NormalItem("Elixir of gus", 10, 20);
        normalItem.updateItem();
        assertEquals(19, normalItem.quality);
        assertEquals(9, normalItem.sellIn);
    }
}