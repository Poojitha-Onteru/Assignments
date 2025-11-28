package com.searchsort;

import java.util.Scanner;

public class MergeSortAlgo {
	
	public static void mergeSort(int[] arr,int left,int right) {
		
		if(left<right) {
			int mid=(left+right)/2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			
			merge(arr,left,mid,right);
		}
		
	}
	
	public static void merge(int[] arr,int left,int mid,int right) {
		
		int ll=mid-left+1;
		int rl=right-mid;
		int larr[]=new int[ll];           //preparing for left partition and right partition..
		int rarr[]=new int[rl];
		
		for(int i=0;i<ll;i++)
			larr[i]=arr[left+i];

	
		for(int i=0;i<rl;i++)
			rarr[i]=arr[mid+1+i];
		
		int i=0,j=0,k=left;
		
		while(i<ll & j<rl) {
			if(larr[i]<=rarr[j]) 
				arr[k++]=larr[i++];
	
			else 
				arr[k++]=rarr[j++];

		}
		while(i<ll)
			arr[k++]=larr[i++];

		
		while(j<rl) 
			arr[k++]=rarr[j++];

	}
	
	public static void main(String[] args) {
		
		int[] arr= {98,87,76,65,54,43,21,1};
		
		System.out.println("elements before sorting:");
		for(int i:arr)
			System.out.print(i+" ");
		mergeSort(arr,0,arr.length-1);
		
		System.out.println("\nElements after sorting");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
