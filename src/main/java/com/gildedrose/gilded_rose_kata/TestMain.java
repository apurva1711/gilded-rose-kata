package com.gildedrose.gilded_rose_kata;

import com.gildedrose.gilded_rose_kata.items.AgedBrieItem;
import com.gildedrose.gilded_rose_kata.items.BackstagePassItem;
import com.gildedrose.gilded_rose_kata.items.ConjuredItem;
import com.gildedrose.gilded_rose_kata.items.DexerityItem;
import com.gildedrose.gilded_rose_kata.items.ElixirMongooseItem;
import com.gildedrose.gilded_rose_kata.items.ItemCategory;
import com.gildedrose.gilded_rose_kata.items.SulfurasItem;
import com.gildedrose.gilded_rose_kata.qualityControl.DecreaseQuality;
import com.gildedrose.gilded_rose_kata.qualityControl.IncreaseQuality;
import com.gildedrose.gilded_rose_kata.qualityControl.NoChangeInQuality;

public class TestMain {

	public static void main(String[] args) {

		Store store = new Store();
		
		ItemCategory dexerity = new DexerityItem(10, 20, new DecreaseQuality(1));
		ItemCategory agedBrieitem = new AgedBrieItem(2, 0, new IncreaseQuality(1));
		ItemCategory elixir = new ElixirMongooseItem(5, 7, new DecreaseQuality(1));
		ItemCategory sulfurasItem = new SulfurasItem(0, 80, new NoChangeInQuality());
		ItemCategory backstagePassItem = new BackstagePassItem(15, 20, new IncreaseQuality(1));
		ItemCategory conjured = new ConjuredItem(3, 6, new DecreaseQuality(2));

		store.add(dexerity);
		store.add(agedBrieitem);
		store.add(elixir);
		store.add(backstagePassItem);
		store.add(sulfurasItem);
		store.add(conjured);

		for (int i = 0; i < 2; i++) {
			System.out.println("Day : " + i + "\n\n");
			for (ItemCategory item : store.getItems()) {
				System.out.println("After Day : " + i);
				System.out.println("Item : " + item);
				item = item.updateQuality(item);
			}
		}
	}

}
