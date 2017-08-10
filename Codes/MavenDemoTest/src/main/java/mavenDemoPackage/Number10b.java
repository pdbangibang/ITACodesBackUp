package mavenDemoPackage;

public class Number10b {

	static int value = 10;
	
	
	public static void main(String[] args)
	{
	
		System.out.println("Main before p1: " + value);
	
		value = p1(value);
	
		System.out.println("Main before p2: " + value);
	
		value = p2(value);
	
		System.out.println("Main at the end: " + value);
	
		System.out.println("-----");
	
		int value = 30;
	
		System.out.println("Main before p1: " + value);
	
		value = p1(value);
	
		System.out.println("Main before p2: " + value);
	
		value = p2(value);
	
		System.out.println("Main at the end: " + value);
	
	}
	
	public static int p1(int input)
	{
		value = input * value;
		System.out.println("In p1: " + value);
		return value;
	}
	
	public static int p2(int input)
	{
		int value = 5;
		value = input / value;
		System.out.println("In p2: " + value);
		return value;
	}
}
