package com.collectionsmodule;

import java.util.HashSet;
import java.util.Iterator;

public class DemoOnHashSet {

	public static void main(String[] args) {
		//no duplicate elements
		//no random access
		//can insert only one null value
		
		
		HashSet<Integer> hs=new HashSet<>();
		hs.add(56);
		hs.add(34);
		hs.add(12);
		hs.add(25);
		hs.add(87);
		hs.add(10);
		System.out.println(hs);
		hs.add(10);
		System.out.println(hs);
		hs.add(null);
		for(Integer i:hs)
			System.out.println(i);
		
		Iterator<Integer> itr=hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		hs.forEach(System.out::println);
		
		System.out.println(hs.size());
	}

}
