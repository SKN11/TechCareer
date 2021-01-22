package com.problem.array;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class FrequencyOfElement {

	public static void main(String[] args) {
		int[] a = {3,3,4,2,4,4,2,4,4};
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
			int ele = arr[i];
			if(hm.containsKey(ele))
			{
				int c = hm.get(ele);
				++c;
				if(c>(arr.length/2))
					return c;
				hm.put(ele, c);
			}else {
				hm.put(ele, 1);
			}
			
		}
		
		Collection<Integer> list =  hm.values();
		
		return -1;
		
	}

}
