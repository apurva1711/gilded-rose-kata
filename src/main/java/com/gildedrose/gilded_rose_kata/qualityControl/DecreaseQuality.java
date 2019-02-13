package com.gildedrose.gilded_rose_kata.qualityControl;

import com.gildedrose.gilded_rose_kata.items.Item;
import com.gildedrose.gilded_rose_kata.items.ItemCategory;
import com.gildedrose.gilded_rose_kata.sellinControl.SellInControl;

public class DecreaseQuality implements QualityControl {
	
	SellInControl sellInControl; 
	int value;

	public DecreaseQuality(int val) {
		value = val;
		sellInControl = new SellInControl();
	}

	@Override
	public ItemCategory updateQuality(ItemCategory item) {
		item = sellInControl.updateSellInControl(item);
		item.quality = item.quality - value;
		if (reachedMinQuality(item))
			item.quality = 0;
		return item;
	}

	private boolean reachedMinQuality(Item item) {
		return item.quality <= 0;
	}

}
