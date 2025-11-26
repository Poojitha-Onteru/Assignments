package com.collectionsmodule;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return (int)(o1.getMarks()-o2.getMarks());
	}

}
