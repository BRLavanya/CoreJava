package InheritancePolymorphism;

class animal {
	public void bark() {
		System.out.println("barking");
	}

	public void run() {
		System.out.println("i can run");
	}

	public void food() {
		System.out.println("i love eating ");
	}
}

class dog extends animal {
	public void bark() {
		System.out.println(" i bark like a dog");
	}

	public void color() {
		System.out.println(" i am doggy which is brown in color");
	}
}

class goldenRetriever extends dog {
	public void breed() {
		System.out.println(" i am golden retriever");
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		goldenRetriever g = new goldenRetriever();
		g.breed();
		g.bark();
		g.color();
		g.food();
		g.run();
	}
}
