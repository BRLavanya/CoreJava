package Programs;

public class DuplicateElementInArray {
public static void main(String[] args) {
	 int a[]=  {5,6,5,7,9};
	 int length=a.length;
	 for(int i=1;i<length;i++)
	 {
		 for(int j=0;j<i;j++)
		 {
			if(a[i]==a[j])
			{
				System.out.println(a[j]);
			}
			 
		 }
	 }
}
}
