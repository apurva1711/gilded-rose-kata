package com.gildedrose.gilded_rose_kata.qualityControl;

import com.gildedrose.gilded_rose_kata.items.ItemCategory;

public class NoChangeInQuality implements QualityControl{

	@Override
	public ItemCategory updateQuality(ItemCategory item) {
		System.out.println("No Change in the Quality");
		return item;
	}

}
