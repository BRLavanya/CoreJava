package Programs;

import java.util.HashMap;

public class CharacterCountInString {
	public static void main(String[] args) {
		String s = "Lavanya";
		char charStr[] = s.toCharArray();
		HashMap<Character, Integer>count= new HashMap<Character, Integer>();
		for(char c: charStr)
		{
			if(count.containsKey(c))
			{
				count.put(c, count.get(c)+1);
			}
			else
			{
				count.put(c, 1);
			}
		}
		System.out.println(count);
	}
}
