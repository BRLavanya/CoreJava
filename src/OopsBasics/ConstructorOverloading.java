package OopsBasics;

public class ConstructorOverloading {
	ConstructorOverloading(int x, int y)
	{
		System.out.println(x+" : "+y);
	}
	ConstructorOverloading(int x, int y, int z)
	{
		System.out.println(x+":"+y+":"+z);
	}
	ConstructorOverloading()
	{
		System.out.println("default constructor");
	}
	public static void main(String[] args) {
		ConstructorOverloading c = new ConstructorOverloading(5, 10);
		ConstructorOverloading c1= new ConstructorOverloading(5, 10, 15);
	}

}
