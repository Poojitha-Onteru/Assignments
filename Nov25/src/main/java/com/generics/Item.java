package com.generics;

public class Item {
	
	private int id;
	private String itemName;
	private double cost;
	
	
	
	
	
	
	public Item(int id, String itemName, double cost) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.cost = cost;
	}






	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", cost=" + cost + "]";
	}
	
	

}
