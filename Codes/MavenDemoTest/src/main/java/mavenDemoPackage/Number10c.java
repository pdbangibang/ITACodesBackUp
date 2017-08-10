package mavenDemoPackage;

public class Number10c {
	public static void main(String[] args)
	{
		int value = 5;
		int value2 = 1;
		
		totalNum(value, value2);
		
		
}
	
	public static int totalNum(int value, int value2) {
	
		int test=0;
		while (value2 < 4)
		{
			for (;value >= value2; value--)
				{
					System.out.println("*");
					test++;
				}
			value2++;
		}
		
		return test;
	}
}
