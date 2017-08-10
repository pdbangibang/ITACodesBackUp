package Day3_exercise5;

public class Dog {

	public void bark(String a) {
		System.out.println("Bark Bark");
	}
	
	public void bark(int a) {
		System.out.println("Bark Bark Bark");
	}
	public void bark(int a, char b) {
		System.out.println("woof woof");
	}
	public void bark(Boolean a) {
		System.out.println("woof woof woof");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog puppy = new Dog();
		
		puppy.bark(true);
		puppy.bark(1);
		puppy.bark("Hello");
		puppy.bark(1, 'a');

	}

}
