package com.gildedrose.gilded_rose_kata;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gildedrose.gilded_rose_kata.items.Item;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

}