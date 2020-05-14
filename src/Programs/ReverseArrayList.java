package Programs;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Virat");
		list.add("rohit");
		list.add("Shikar");
		list.add("ashwin");
		list.add("ravindra");
		list.add("Bhargav");
		System.out.println("before reversing the list ");
		System.out.println(list);
		System.out.println("after reversing the list");
		Collections.reverse(list);
		System.out.println(list);
	}
}
