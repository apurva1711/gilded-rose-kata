package com.gildedrose.gilded_rose_kata.items;

import com.gildedrose.gilded_rose_kata.qualityControl.QualityControl;
import com.gildedrose.gilded_rose_kata.sellinControl.SellInControl;

public abstract class ItemCategory extends Item {
	
	protected QualityControl qualityControl;

	protected SellInControl sellInControl = new SellInControl();
	
	public ItemCategory(String name, int sellin, int quality, QualityControl q) {
		super(name, sellin, quality);
		qualityControl = q;
	}
	
	public ItemCategory(String name, int sellin, int quality) {
		super(name, sellin, quality);
	}
	
	public ItemCategory updateQuality(ItemCategory item) {
		item = qualityControl.updateQuality(item);
		return item;
	}

	public void setQualityControl(QualityControl qualityControl) {
		this.qualityControl = qualityControl;
	}

}
