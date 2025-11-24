package practice2.StringClasses;

import java.io.File;
import java.io.FileNotFoundException;

public class DemoFileNotFound {
	
	
	public static void useFile(File f1) throws FileNotFoundException {
		if(!f1.exists())
			throw new FileNotFoundException();
			
	}
	
	
	public static void main(String[] args)  {
		File f1=new File("demo.txt");
		
		try {
			useFile(f1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Applicaion ended");
	}

}
