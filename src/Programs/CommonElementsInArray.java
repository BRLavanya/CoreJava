package Programs;

public class CommonElementsInArray {
public static void main(String[] args) {
	String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
	String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
	for(int i=0;i<s1.length;i++)
	{
		for(int j=0;j<s2.length;j++)
		{
			if(s1[i]==s2[j])
			{
				System.out.println("common elements in both string is: "+s1[i]);
				System.out.println("common elements are present at index for s1 array at "+i+" ,s2 array at: "+j);
			}
		}
	}
}
}
