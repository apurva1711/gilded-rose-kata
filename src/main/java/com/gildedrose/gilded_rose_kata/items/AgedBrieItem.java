package com.gildedrose.gilded_rose_kata.items;

import com.gildedrose.gilded_rose_kata.qualityControl.QualityControl;

public class AgedBrieItem extends ItemCategory {
	
	public AgedBrieItem(int sellIn, int quality, QualityControl q) {
		super("Aged Brie", sellIn, quality, q);
	}	
}
