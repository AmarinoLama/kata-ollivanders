package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {
    @Test
    void testUpdateItem() {
        Item[] items = new Item[] {
                new NormalItem("Aguita chica gamer", 14, 20),
                new NormalItem("Cuerno de centaleon", 11, 7),
                new AgedBrie("Aged Brie", 10, 0),
                new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80),
                new Backstage("Backstage passes to a TAFKAL80ETC concert", 13, 10),
                new Backstage("Backstage passes probably going to expire", 11, 10),
                new Conjured("Conjured Tareas Contoros", 3, 50) };

        GildedRose app = new GildedRose(items);

        int days = 12;

        for (int i = 0; i < days; i++) {
            app.updateItem();
        }

        assertEquals(2, items[0].sellIn);
        assertEquals(8, items[0].quality);

        assertEquals(-1, items[1].sellIn);
        assertEquals(-6, items[1].quality);

        assertEquals(-2, items[2].sellIn);
        assertEquals(14, items[2].quality);

        assertEquals(-1, items[3].sellIn);
        assertEquals(80, items[3].quality);

        assertEquals(1, items[4].sellIn);
        assertEquals(37, items[4].quality);

        assertEquals(-1, items[5].sellIn);
        assertEquals(0, items[5].quality);

        assertEquals(-9, items[6].sellIn);
        assertEquals(8, items[6].quality);

    }
}