package Programs;

public class DuplicateCharactersInAString {
public static void main(String[] args) {
	String str ="Pallavi";
	int count =0;
	char[]ch= str.toCharArray();
	for(int i=0;i<str.length();i++)
	{
		for(int j=0;j<i;j++)
		{
			if(ch[i]==ch[j])
			{
				System.out.println(ch[j]);
				count++;
			}
		}
	}
	if(count==0)
	{
		System.out.println("no duplicate characters");
	}
}
}
