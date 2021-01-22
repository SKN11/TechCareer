package com.problem.gfg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Anagram {  //both string conatin same character

	public static void main(String[] args) {  
		String a = "geeksforgeeks";
		String b = "forgeeksgeeks";
		
		
//		int rc = anagram(a, b);
//		if(rc == -1) {
//			System.out.println("not an anagram");
//		}
//		else {
//			System.out.println("It is a anagram");
//		}
		
		boolean rc = anagramSolution1(a, b);
		if(rc) {
			System.out.println("It is a anagram");
		}
		else {
			System.out.println("not an anagram");
		}
		

	}
	
	public static boolean anagramSolution1(String a,String b) { //Time Complexity: O(nLogn)
		char[] chA = a.toCharArray();
		char[] chB = b.toCharArray();
		
		if(chA.length!=chB.length)  //checking for length
		{
			return false;
		}
		Arrays.sort(chA);  //sorting it and compare each element to each other
		Arrays.sort(chB);
		
		for(int i=0;i<a.length();i++) 
		{
			if(chA[i]!=chB[i])
			{
				return false;
			}
			
		}
		
		return true;
		
		
	}
	
	public static int anagram(String a,String b) {
		
		HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0;i<a.length();i++)
		{
			char ele = a.charAt(i);
			if(hm.containsKey(ele))
			{
				int c = hm.get(ele);
				++c;
				hm.put(ele, c);
			}else {
				hm.put(ele, 1);
			}
			
		}
		
		
		
		for(int i=0;i<b.length();i++)
		{
			char ch = b.charAt(i);
			//System.out.println("checking :" + ch);
			if(hm.containsKey(ch))
			{
				int c = hm.get(ch);
				if(c==0)
					return -1;
				--c;
				if(c<0)
					continue;
				//System.out.println(ch + " present , remaining "+ch + " : " +c);
				
				hm.put(ch, c);
				printMap(hm);
				
				
			}else {
				return -1;
			}
			//System.out.println("------");
			
		}
		
		boolean m = valuePresentInMap(hm);
		//System.out.println(m);
		if(m ) {
			
			return -1;
		}
		
		return 0;
		
		
		
	}
	
	static <K,V> void printMap(HashMap<K, V> hm) {
		for(Entry<K,V> entry : hm.entrySet()) {
			//System.out.print(entry.getKey()+"=" + entry.getValue()+",");
		}
	}
	
	static <K,V> boolean valuePresentInMap(HashMap<K, V> hm) {
		for(Entry<K,V> entry : hm.entrySet()) {
			if((Integer)entry.getValue() > 0  )
				return true;
		
		}
		return false;
	}

}
