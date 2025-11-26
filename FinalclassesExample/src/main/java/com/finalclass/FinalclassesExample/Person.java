package com.finalclass.FinalclassesExample;

public final class Person {
	private final String name;
	private final int id;
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
	
}
