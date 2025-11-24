package practice2.StringClasses;

import java.util.Scanner;

public class ArraysQuestion1 {
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int[] arr=new int[10];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		for(int x:arr)
			System.out.println(x);
		
		System.out.println("Enter element to be inserted and also position:");
		int ele=s.nextInt();
		int pos=s.nextInt();
		
		
	}

}
