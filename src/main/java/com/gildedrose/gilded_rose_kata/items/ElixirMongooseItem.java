package com.gildedrose.gilded_rose_kata.items;

import com.gildedrose.gilded_rose_kata.qualityControl.QualityControl;

public class ElixirMongooseItem extends ItemCategory {

	public ElixirMongooseItem(int sellin, int quality, QualityControl q) {
		super("Elixir of Mongoose", sellin, quality, q);
	}
}
