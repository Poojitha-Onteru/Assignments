package practice2.StringClasses;

public class DemoExceptions {
	
	
	public static void extractString() {
	
		String str=null;
		if(str==null)
			throw new NullPointerException();
	}
	
	
	
	
	public static void main(String[] args) {
		
		try {
			extractString();
		}
		catch(NullPointerException ne) {
			ne.printStackTrace();
		}
		System.out.println("Closed Successfully...!");
	}
}
