package com.designpatterns;

public class TeaMaker extends DrinkMaker {
	@Override
	void makeDrink() {
		System.out.println("Making Coffee");
	}
	
	@Override
	void addExtras() {
		System.out.println("Adding sugar,and Ginger");
	}
}
