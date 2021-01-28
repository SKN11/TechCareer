package com.problem.string;

import java.util.ArrayList;
import java.util.List;

public class RemoveSecondStrCharFromFirst {
	
	//https://practice.geeksforgeeks.org/problems/remove-character3815/1
	public static void main(String[] args) {
		String result = removeChars("jznpcsojzozgpcn", "toaewnevyxlir");
		System.out.println("result : " + result);
	}
	
	static String removeChars(String string1, String string2){
		List<Character> list = new ArrayList<Character>();
		char[] ch = string1.toLowerCase().toCharArray();
		char[] ch2 = string2.toLowerCase().toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			list.add(ch[i]);
		}
		System.out.println(list);

		for(int i=0;i<ch2.length;i++)
		{
			while(list.contains(ch2[i]))  //remove all occurences of second str character
			{
				int index = list.indexOf(ch2[i]); //find index otherwise u will get wrong output
				list.remove(index);
			}
		}
		System.out.println(list);
		
		StringBuilder builder = new StringBuilder(list.size());
		for(Character ch1: list)
		{
			builder.append(ch1);
		}
		return builder.toString();

	}

}
