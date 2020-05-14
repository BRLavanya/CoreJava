package Programs;

public class LargestNumberWithoutGivenNumber {
public static void main(String[] args) {
	int number=143;
	int digit=3;
	char c = Integer.toString(digit).charAt(0);
	for(int i=number;i>0;--i)
	{
		System.out.println(Integer.toString(i).indexOf(c));
		if(Integer.toString(i).indexOf(c)==-1)
		{
			System.out.println(i);
			break;
		}
	}
}
}
