package OopsBasics;

public class CreatingObjectWithOneType {
	public void rectangle(int length, int width) {
		int area = length * width;
		System.out.println("area of rectangle is: " + area);
	}

	public static void main(String[] args) {
		CreatingObjectWithOneType rec1 = new CreatingObjectWithOneType(), rec2 = new CreatingObjectWithOneType();
		rec1.rectangle(2, 3);
		rec2.rectangle(4, 5);
	}
}
