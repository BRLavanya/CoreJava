package Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateElementInArray {
public static void main(String[] args) {
	int a[]={4, 3, 2, 4, 9, 2} ;
	ArrayList<Integer>arr= new ArrayList<Integer>();
	for(int i=0;i<a.length;i++)
	{
		arr.add(a[i]);
	}
	for(int i =0;i<arr.size();i++)
	{
		for(int j=i+1;j<arr.size();j++)
		{
			if(arr.get(i)==arr.get(j))
			{
				arr.remove(j);
			}
		}
	}
System.out.println(arr);
}
}
