package com.lambdapractice;

import java.util.function.Consumer;

public class LambdaAssignment {
	
	public static class StringFunctions{
		public static void strHavingA(String[] str) {
			for(String s:str) {
				if (s.charAt(0)=='A' || s.charAt(0)=='a')
					System.out.println(s);
			}
				
		}
	}
	public static void main(String[] args) {
		
		Consumer<String[]> startA=StringFunctions::strHavingA;
		String[] sarr= {"pooji","ali","Akhila","Abhi"};
		startA.accept(sarr);
	}
}


