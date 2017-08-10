package testExer;

class ClassA {
	public ClassA() {		
		System.out.println("I am class A");
	}

}

class ClassB {
	public ClassB() {
		System.out.println("I am class B");
	}

}

class ClassC extends ClassA{
	ClassB classB = new ClassB();
	
}

public class testExercise {
	public static void main(String[] args) {
		ClassC classC = new ClassC();

	}

}
