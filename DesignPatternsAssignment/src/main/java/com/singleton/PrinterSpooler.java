package com.singleton;

public class PrinterSpooler {
	
	public static PrinterSpooler instance;
	public static String msg;
	public PrinterSpooler() {
		System.out.println("The printer is all set..!");
	}
	
	public static PrinterSpooler getInstance() {
		if(instance!=null)
			return instance;
		else
			return instance=new PrinterSpooler();
	}
	
	public static void addJob(String text) {
		msg=text;
	}
	
	public static void processJob() {
		System.out.println(msg);
	}
	

}
