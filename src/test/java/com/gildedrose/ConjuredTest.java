package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConjuredTest {

    @Test
    void updateQuality() {
        Conjured conjured = new Conjured("Conjured", 10, 10);
        conjured.updateQuality();
        assertEquals(8, conjured.quality);
    }

    @Test
    void updateQualitySellInZero() {
        Conjured conjured = new Conjured("Conjured", 0, 10);
        conjured.updateQuality();
        assertEquals(6, conjured.quality);
    }
}