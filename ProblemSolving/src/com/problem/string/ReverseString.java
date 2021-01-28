package com.problem.string;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="skyeuro ji";
		StringBuffer sb = new StringBuffer(s); //this aaproach is trivial dont use
		//System.out.println(sb.reverse());
		stringReverse(s);
		
	}
	
	public static void stringReverse(String s) {
		if(s==null || s.isEmpty()) //makr sure u apply edge cases in all program
			return;
		
		char[] ch = s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j)   //withfor loop it is tough to understand when two ptr i , j meet
		{
			swap(ch ,i,j);
			i++;
			j--;
			
		}
		
		System.out.println(String.valueOf(ch));
	}
	
	public static void swap(char[] ch , int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

}
