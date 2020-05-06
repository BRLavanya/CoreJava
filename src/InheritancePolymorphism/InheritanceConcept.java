package InheritancePolymorphism;

class Employee {
	public int salary = 10000;
}

class programmer extends Employee {
	int Bonus = 5000;

	public int salary() {
		salary += Bonus;
		return salary;
	}
}

public class InheritanceConcept {
	public static void main(String[] args) {
		programmer p = new programmer();
		System.out.println("salary is " + p.salary());
	}
}
