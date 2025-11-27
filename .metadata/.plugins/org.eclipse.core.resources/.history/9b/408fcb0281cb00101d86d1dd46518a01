package com.searchsort;

public class BubbleSortAlgo {
	public static void main(String[] args) {
		int[] arr= {12,56,32,21,54,67,90,34,65,78,1,3,77,45};
		
		System.out.println("elements before sorting:");
		for(int i:arr)
			System.out.print(i+" ");
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		System.out.println("\nelements after sorting:");
		for(int i:arr)
			System.out.print(i+" ");
	}

}
