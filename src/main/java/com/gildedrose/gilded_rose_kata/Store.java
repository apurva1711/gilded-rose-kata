package com.gildedrose.gilded_rose_kata;

import java.util.ArrayList;
import java.util.List;

import com.gildedrose.gilded_rose_kata.items.ItemCategory;

public class Store {

	private List<ItemCategory> items = new ArrayList<>();
	
	public List<ItemCategory> getItems() {
		return items;
	}

	public void setItems(List<ItemCategory> items) {
		this.items = items;
	}

	public void add(ItemCategory item) {
		items.add(item);
	}

}
