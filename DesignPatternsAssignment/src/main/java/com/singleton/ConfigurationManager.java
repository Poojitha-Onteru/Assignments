package com.designpatterns.DesignPatternsAssignment;

import com.singleton.Logger;

public class ConfigurationManager {
	
	private static ConfigurationManager instance;
	private static String model="Nothing 3A";
	private static String mode="dark";
	
	
	public static ConfigurationManager getInstane() {
		if(instance!=null)
			return instance;
		else
			return instance=new ConfigurationManager();
	}
	
	public static void appSettings() {
		System.out.println(model);
		System.out.println(mode);
	}

}
