package com.collectionsmodule;

import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(23);
		ll.add(12);
		ll.add(67);
		ll.add(1);
		ll.add(45);
		ll.add(90);
		ll.add(14);
		ll.addFirst(89);
		ll.addLast(10);
		Iterator<Integer> itr=ll.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println(ll.offer(100));
		System.out.println(ll);
		ll.offerFirst(0);
		ll.offerLast(200);
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll.poll());
		System.out.println(ll);
		ll.pollFirst();
		System.out.println(ll);
		ll.pollLast();
		System.out.println(ll);
		LinkedList<Integer> ll2=(LinkedList<Integer>) ll.clone();
		System.out.println(ll.hashCode());
		System.out.println(ll2.hashCode());
		ll.addFirst(0);
		System.out.println(ll.hashCode());
		
		System.out.println(ll.contains(20));
		
		System.out.println(ll.pop());
		
		
	}

}
