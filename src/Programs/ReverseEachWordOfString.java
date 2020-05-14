package Programs;

public class ReverseEachWordOfString {
	public static void main(String[] args) {
		String s1 = "Java Concept Of The Day";
		String reveString="";
		String [] words=s1.split(" ");
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reveWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reveWord=reveWord+word.charAt(j);
			}
			reveString=reveString+reveWord+" ";
		}
		System.out.println(reveString);
		// char c[]=s1.toCharArray();
//	char newchar[]=new  char [c.length];
//	for(int i=0;i<s1.length();i++)
//	{
//		if(c[i]==' '||c[i]=='\t')
//		{
//			for(int j=0;j<i;j++)
//			{
//				newchar[j]+=c[i-j-1];
//			}
//			System.out.print(newchar);
//		}
//
//	}System.out.println("");
//	System.out.println(newchar);

	}
}
