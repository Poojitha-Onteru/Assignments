package practice2.StringClasses;

public class CustomException {

	public static void main(String[] args) throws AgeNotSufficientException {
		
		Person p1=new Person("Pooji",12,19);
		Person p2=new Person("lally",13,17);
		try {
			p1.checkEligbility(p1.getAge());
			p2.checkEligbility(p2.getAge());
		}
		
		finally {
			System.out.println("Application closed..!");
		}
	}

}
