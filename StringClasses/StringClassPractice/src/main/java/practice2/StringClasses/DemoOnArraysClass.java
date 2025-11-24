package practice2.StringClasses;

import java.util.Arrays;
import java.util.Scanner;

public class DemoOnArraysClass {
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		int[] arr= {3,2,3,0,1};
		String nums=Arrays.toString(arr);
		System.out.println(nums.getClass());
		Arrays.sort(arr);
		for(int x:arr)
			System.out.println(x);
		
		int i;
//		System.out.println("Enter element to be searched");
//		int sel=s.nextInt();
//		for(i=0;i<arr.length;i++) {
//			if(arr[i]==sel)
//				break;
//		}
//		System.out.println("the element "+sel+" is at pos:"+(i+1));	
		
		int[] brr= {0,1,2,3,4};
		System.out.println(Arrays.equals(arr, brr));
		int[] crr=Arrays.copyOf(arr,20);
		for(int x:crr)
				System.out.println(x);
		
		Arrays.fill(arr, 97);
		for(int x:arr)
			System.out.println(x);
		
		
	}
}
