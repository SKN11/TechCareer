package com.problem.string;

public class CamelCaseToSnakeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer s= new StringBuffer("hello");
		//System.out.println(s.append("hi"));
		
		String s= "i love programming";
		String result = transform(s);
		System.out.println(result);

	}
	
	public static String transform(String s1)
	{

		String[] arr = s1.split(" ");
		String res="";

		for(int i=0;i<arr.length;i++)
		{
			String s = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1,arr[i].length());
			res+=(s+"_");

		}

		return res.substring(0,res.length()-1);
	}

}
