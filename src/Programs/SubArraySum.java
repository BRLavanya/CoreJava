package Programs;

public class SubArraySum {
public static void main(String[] args) {
	int a[]={12, 5, 31, 9, 21, 8};
	int number=45;
	int sum=a[0];
	int start=0;
	for(int i=1;i<a.length;i++)
	{
		sum=sum+a[i];
		while(sum>number&&start<=i-1)
		{
			sum=sum-a[start];
			start++;
		}
		if(sum==number)
		{
			for(int k=start;k<=i;k++)
			{
				System.out.print(a[k]+",");
			}
			System.out.println(" ");
		}
	}
	
}
}

