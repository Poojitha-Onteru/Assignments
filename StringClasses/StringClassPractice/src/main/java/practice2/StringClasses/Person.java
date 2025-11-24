package practice2.StringClasses;

public class Person {

	private String name;
	private int id;
	private int age;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public void checkEligbility(int age)throws AgeNotSufficientException{
		if(this.age>18)
			System.out.println("person can cast their vote");
		else
			throw new AgeNotSufficientException("person age is less than 18..!");
	}
	

}
