package Programs;

import java.util.Random;

public class RandomNumbers {
public static void main(String[] args) {
	Random r = new Random();
	System.out.println("random integers");
	for(int i=0;i<5;i++)
	{
		System.out.println(r.nextInt());
	}
	System.out.println("random float");
	for(int i=0;i<5;i++)
	{
		System.out.println(r.nextFloat());
	}
}
}
