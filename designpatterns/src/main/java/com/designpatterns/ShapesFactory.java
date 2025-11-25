package com.designpatterns;

public class ShapesFactory {
	
	public static Shape getShape(String type) {
		if(type.equals("Circle"))
			return new Circle();
		else if(type.equals("Square"))
				return new Square();
		return null;
				
	}

}
