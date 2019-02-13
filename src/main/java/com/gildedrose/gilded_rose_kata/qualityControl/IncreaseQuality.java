package com.gildedrose.gilded_rose_kata.qualityControl;

import com.gildedrose.gilded_rose_kata.items.Item;
import com.gildedrose.gilded_rose_kata.items.ItemCategory;
import com.gildedrose.gilded_rose_kata.sellinControl.SellInControl;

public class IncreaseQuality implements QualityControl {

	SellInControl sellInControl;
	
	int value;

	public IncreaseQuality(int val) {
		value = val;
		sellInControl = new SellInControl();
	}

	@Override
	public ItemCategory updateQuality(ItemCategory item) {
		item.quality += value;
		if (reachedMaxQuality(item)) {
			item.quality = 50;
		}
		item = sellInControl.updateSellInControl(item);
		return item;
	}

	private boolean reachedMaxQuality(Item item) {
		return item.quality >= 50;
	}
}
