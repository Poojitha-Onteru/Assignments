package com.practice1;


public class App {
    public static void main(String[] args) {
    	Employee emp=new Employee();
    	System.out.println(emp);
    	emp.setEmpId(121);
    	emp.setEmpname("Jaya");
    	emp.setDesignation("Trainer");
    	emp.setMobileNum("9898989878");
    	System.out.println(emp);
    	
    	Employee emp2=new Employee("priya",122,"Developer","7890678903");
    	System.out.println(emp);
        
    }
}
