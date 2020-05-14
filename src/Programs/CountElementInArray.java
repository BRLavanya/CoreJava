package Programs;

import java.util.HashMap;

public class CountElementInArray {
	public static void main(String[] args) {
		char ch[] = { 12, 9, 12, 9, 10, 9, 10, 11 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < ch.length; i++) {
			int c = ch[i];
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}
