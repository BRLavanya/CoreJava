package Programs;

import java.util.Arrays;

public class Sorting {
public static void main(String[] args) {
	int a[]= {45,84,101,62,12,45};
	int temp,pos;
	for(int i=0;i<a.length;i++)
	{
		pos=i;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[j]<a[pos])
			{
				pos=j;
			}
		}
		temp=a[i];
		a[i]=a[pos];
		a[pos]=temp;
	}
	System.out.println(Arrays.toString(a));
}
}
