package Programs;

import java.util.LinkedHashMap;

public class LongestSubstring {
public static void main(String[] args) {
	String str= "JavaConceptOfTheDay";
	str=str.toLowerCase();
	int longestSubstruinglength=0;
	String longestSubstring=null;
	LinkedHashMap<Character, Integer>map=new LinkedHashMap<Character, Integer>();
	char c[]=str.toCharArray();
	for(int i =0;i<c.length;i++)
	{
		char ch= c[i];
		if(!map.containsKey(ch))
		{
			map.put(ch, i);
		}
		else
		{
			i=map.get(ch);
			map.clear();
		}
		if(map.size()>longestSubstruinglength)
		{
			longestSubstruinglength=map.size();
			longestSubstring=map.keySet().toString();
		}
	}
	System.out.println(longestSubstring);
	System.out.println(longestSubstruinglength);
}
}
