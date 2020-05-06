package OopsBasics;
class area{
	int x;
	static public void areaMeasurement(int x)
	{
		//this.x=x;
		System.out.println("area : "+(x*x*x));
	}
}
public class StaticMethod {
public static void main(String[] args) {
	area.areaMeasurement(5);
}
}
