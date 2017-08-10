package mavenDemoPackage;

public class Number10e {

	public static void main(String[] args)
	{
	int one = 1;
	int two = 2;
	int three = 3;
	check(one, two, three);
	
		
	
}
	
	public static String check(int one, int two, int three) {
		String test ="";
		
		do
		{
			one++;
			System.out.print("cart");
			test += "cart";
		}
		while ( one < 3);
	
		for (int i = 0; i < two; i++)
		{
			System.out.print("o");
			test +="o";
		}
		
		while (true)
		{
			three++;
			if (three == 5)
			{
				break;
			}
			System.out.print("n");
			test +="n";
		}
		
	return test;	
	}
}

