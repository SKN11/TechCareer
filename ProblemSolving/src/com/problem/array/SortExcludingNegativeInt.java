package com.problem.array;

import java.util.HashMap;

public class SortExcludingNegativeInt {

	public static void main(String[] args) {
		
		int[] a = {-8,-5,-3,-1,3,6,9}; //o/p {-1,-3,3,-5,6,-8,9}
		//int[] a = {8,5,3,1,3,6,9};
		int[] b =sort(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i] + ",");
		}
		
	}
	
	
	public static int[] sort(int[] arr) {
		
		
		for(int t=0;t<arr.length;t++)
		{
			int i=t;
			int j=i-1;
			while(j>-1)
			{
				if(Math.abs(arr[i]) < Math.abs(arr[j]))
					{
					int temp= arr[i];
					arr[i] = arr[j];
					arr[j] =temp;
					j--;
					i--;
					}
				else 
				{
					break;
					//j--;
					//continue;
				}
					
					
					
			}
			
		}
		return arr;
		
	}
	
	
}
