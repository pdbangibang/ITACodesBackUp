package mavenDemoPackage;

public class Number1 {

	public static void main(String[] args) {
		// cases(i);
		int i = 1;
		cases(i);
	}

	public static boolean cases(int i) {

		boolean done = false;

		for (int j = 0; j < 5; j = j + 2) {
			
			i = (i * i) + j;

		}
		
		switch (i) {
		case 3:
			System.out.println("zero");
			break;
		case 13:
			System.out.println("one");

		case 175:
			System.out.println("two");

		default:
			System.out.println("default");
			done = true;
		}

		return done;

	}

}
