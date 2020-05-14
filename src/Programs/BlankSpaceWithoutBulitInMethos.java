package Programs;

public class BlankSpaceWithoutBulitInMethos {
public static void main(String[] args) {
	String str ="Lavanya B            R   chetan";
	char[] stringWithSpaces=str.toCharArray();
	String strWithoutSpaces="";
	for(int i =0;i<str.length();i++)
	{
		if((!(stringWithSpaces[i]==' '))&&(!(stringWithSpaces[i]=='\t')))
		{
			strWithoutSpaces+=stringWithSpaces[i];
		}
		
	}
	System.out.println(strWithoutSpaces);
}
}
