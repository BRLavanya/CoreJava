package Programs;

import java.util.ArrayList;

public class ArrayListDuplicate {
public static void main(String[] args) {
	ArrayList<Integer>a= new ArrayList<Integer>();
	a.add(45);
	a.add(36);
	a.add(85);
	a.add(45);
	a.add(36);
	for(int i=0;i<a.size();i++)
	{
		for(int j=i+1;j<a.size();j++)
		{
			if(a.get(i).equals(a.get(j)))
			{
				a.remove(i);
				i--;
				break;
			}
		}
	}
	System.out.println(a);
}
}
