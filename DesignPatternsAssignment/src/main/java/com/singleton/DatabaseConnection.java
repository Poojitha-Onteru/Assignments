package com.designpatterns.DesignPatternsAssignment;

public class DatabaseConnection {
	private static DatabaseConnection instance;
	
	
	public static DatabaseConnection getInstane() {
		if(instance!=null)
			return instance;
		else
			return instance=new DatabaseConnection();
	}

}
