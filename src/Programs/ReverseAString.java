package Programs;

import java.util.Scanner;

public class ReverseAString {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the string");
	String str= sc.next();
	char[] c=str.toCharArray();
	String rev= "";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev+=c[i];
	}
	System.out.println(rev);
}
}
