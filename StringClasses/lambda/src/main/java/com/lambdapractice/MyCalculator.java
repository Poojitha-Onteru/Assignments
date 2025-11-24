package com.lambdapractice;

public class MyCalculator {

	
	
	
	public static void main(String args[]) {
		
		//having parameters having the return type
//		Calculator mc=(int a, int b)-> a+b;
//		System.out.println(mc.add(2, 3));
		
		//having parameters and no return type
//		Calculator c=(int a,int b)->System.out.println(a-b);
//		c.sub(3, 2);
		
		//no parameters and no return
//		Calculator c=()->{
//			int a=2,b=4;
//			System.out.println(a*b);
//		};
//		c.mul();
		
		//no parameters but having return type
		Calculator d=()->{
			int a=5,b=2;
			return ((float)a/b);
		};
		System.out.println(d.div());
		
	}

}


