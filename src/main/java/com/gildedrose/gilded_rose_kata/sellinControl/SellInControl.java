package com.gildedrose.gilded_rose_kata.sellinControl;

import com.gildedrose.gilded_rose_kata.items.ItemCategory;

public class SellInControl {

	public ItemCategory updateSellInControl(ItemCategory item) {
		item.sellIn = item.sellIn - 1;
		if(item.sellIn < 0) {
			item.sellIn = 0;
		}
		return item;
	}
}
