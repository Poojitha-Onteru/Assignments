package com.collectionsmodule;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoOnTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(1);
		ts.add(3);
		ts.add(5);
		ts.add(7);
		ts.add(9);
		ts.add(4);
		ts.add(39);
		ts.add(8);
		ts.add(56);
		System.out.println(ts);
		System.out.println(ts.ceiling(36));
		System.out.println(ts.floor(2));
		
		System.out.println("-----using iterator-------");
		Iterator<Integer> itr=ts.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println(ts.headSet(5));
		System.out.println(ts.tailSet(38));
		System.out.println(ts.higher(39));
		System.out.println(ts.last());
		System.out.println(ts.lower(8));
		System.out.println("-----Adding student to Tree Set---------");
		TreeSet<Student> stutree=new TreeSet<>();
		stutree.add(new Student(120,"Thanu",24,"Nellore",27));
		stutree.add(new Student(121,"siri",20,"Bangalore",28));
		stutree.add(new Student(122,"priya",21,"Nellore",19));
		stutree.add(new Student(123,"siri",22,"Bangalore",23));
		stutree.add(new Student(124,"pooji",22,"Chennai",25));
		stutree.add(new Student(125,"sreya",24,"Nellore",24));
		stutree.add(new Student(126,"siri",20,"Bangalore",22));
		stutree.add(new Student(127,"preethi",21,"Nellore",16));
		stutree.add(new Student(128,"pooja",21,"Bangalore",24));
		stutree.add(new Student(129,"poojitha",22,"Chennai",25));
		System.out.println(stutree);
		
	}

}
