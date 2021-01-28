package com.problem.string;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "hqghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvs";
		
		//no repeated char string
		//String s ="tkjprepggxrpnrvystmwcysyycqpevikeffmznimkkasvwsrenzkycxfxtlsgypsfadpooefxzbcoejuvpvaboygpoeylfpbnpljvrvipyamyehwqnqrqpmxujjloovaowuxwhmsncbxcoksfzkvatxdknlyjyhfixjswnkkufnuxxzrzbmnmgqooketlyhnkoaugzqrcddiuteiojwayyzpvscmpsajlfvgubfaaovlzylntrkdcpwsrtesjwhdizcobzcnfwlqijtvdwvxhrcbldvgylwgbusbmborxtlhcsmpxohgmgnkeufdxotogbgxpeyanfetcukepzshkljugggekjdqzjenpevqgxiepjsrdzjazujllchhbfqmkimwzobiwybxduunfsksrsrtekmqdcyzjeeuhmsrqcozijipfioneeddpszrnavymmtatbdzqsoemuvnpppsuacbazuxmhecthlegrpunkdmbppweqtg";
		
		char ch = nonrepeatingCharacter(s);
		System.out.println(ch);
	}
	
	static char nonrepeatingCharacter(String S)
	{
		LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
		char[] ch = S.toCharArray();
		char res = ' ';
		if(ch.length == 1)
		{
			return ch[0]; 
		}

		for(int i=0;i<ch.length;i++)
		{

			char ele = ch[i];
			if(hm.containsKey(ele))
			{
				int c = hm.get(ele);
				++c;
				hm.put(ele, c);
			}else {
				hm.put(ele, 1);
			}

		}

		Set<Character> keySet = hm.keySet();
		Collection<Integer> valueSet = hm.values();

		// System.out.println(keySet);
		//System.out.println(valueSet);       
		//System.out.println("++++++++++++");

		Iterator<Character> itr = keySet.iterator();
		Iterator<Integer> itr2 = valueSet.iterator();

		while(itr.hasNext() && itr2.hasNext()){
			// System.out.println(itr.next());
			//  System.out.println(itr2.next());
			//System.out.println("====");
			int val = itr2.next();
			char keyVal =   itr.next();
			//     System.out.println(keyVal + " : " +val);
			// System.out.println("====");



			if(val == 1)
			{
				res =  keyVal;
				break;

			}

		}
		if(res == ' ')
			return '$';
		else
			return res;

	}

}
