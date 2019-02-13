package com.gildedrose.gilded_rose_kata.items;

import com.gildedrose.gilded_rose_kata.qualityControl.DecreaseQuality;
import com.gildedrose.gilded_rose_kata.qualityControl.IncreaseQuality;
import com.gildedrose.gilded_rose_kata.qualityControl.QualityControl;

public class BackstagePassItem extends ItemCategory {

	public BackstagePassItem(int sellIn, int quality, QualityControl q) {
		super("Backstage passes", sellIn, quality, q);
	}

	@Override
	public ItemCategory updateQuality(ItemCategory item) {

		if (item.sellIn <= 10 && item.sellIn > 5)
			setQualityControl(new IncreaseQuality(2));
		else if (item.sellIn <= 5 && item.sellIn > 1)
			setQualityControl(new IncreaseQuality(3));
		else if (item.sellIn <= 1)
			setQualityControl(new DecreaseQuality(item.quality));

		return qualityControl.updateQuality(item);
	}

}
