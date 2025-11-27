package com.searchsort;

public class InsertionSortAlgo {
	public static void main(String[] args) {
		
int[] arr= {12,56,32,21,54,67,90,34,65,78,1,3,77,45};
		
		System.out.println("elements before sorting:");
		for(int i:arr)
			System.out.print(i+" ");
		
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println("\nelements after sorting:");
		for(int i:arr)
			System.out.print(i+" ");
		
	}

}
