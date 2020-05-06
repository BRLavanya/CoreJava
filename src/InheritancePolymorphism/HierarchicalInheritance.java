package InheritancePolymorphism;

class animals {
	public void run() {
		System.out.println("run");
	}
}

class dogs extends animals {
	public void iam() {
		System.out.println("i am a dog");
	}
}

class cat extends animals {
	public void iam() {
		System.out.println("i am a cat");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		dogs d = new dogs();
		d.run();
		d.iam();
		cat c = new cat();
		c.run();
		c.iam();
	}
}
