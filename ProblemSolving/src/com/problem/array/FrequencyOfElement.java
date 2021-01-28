package com.problem.array;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class FrequencyOfElement {

	public static void main(String[] args) {
		int[] a = {3,3,4,2,4,4,2,4,4};
		
		//int[] a = {3};
		
		int rc = findfrequency(a);
		if(rc==-1)
			System.out.println("Not Found");
		else {
			System.out.println(rc);
		}
		
		
		

	}
	
	public static int findfrequency(int[] arr) {
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr.length == 1)
			{
			System.out.println("Element : " + arr[0] + " occurred :" + 1);
			}
			int ele = arr[i];
			if(hm.containsKey(ele))
			{
				int c = hm.get(ele);
				++c;
				if(c>(arr.length/2))
				{
					System.out.print("Element : " + arr[i] + " occurred : " );
					
					return c;
				}
				hm.put(ele, c);
			}else {
				hm.put(ele, 1);
			}
			
		}
		
		//hm.values();
	
		
		return -1;
		
	}

}
