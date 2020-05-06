package ControlStatements;

public class ContinueStatement {
public static void main(String[] args) {
	for(int i =1;i<=10;i++)
	{
		if(i==5)
		{
			continue;
			//i++; -- unreachable code
		}
		System.out.println(i);
		
	}
}
}
