package com.designpatterns;

public abstract class DrinkMaker {
	
	abstract void makeDrink();
	abstract void addExtras();
	public final void prepareDrink() {
		boilWater();
		makeDrink();
		addExtras();
		serve();
	}
	
	public void boilWater() {
		System.out.println("Water boiled");
	}
	
	public void serve() {
		System.out.println("drink served");
	}

}
