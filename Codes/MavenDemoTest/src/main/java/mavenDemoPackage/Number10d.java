package mavenDemoPackage;

public class Number10d {

	static boolean a,b,c;
	public static void main(String[] args)
	{
		a = true;
		b = false;
		c = false;
		System.out.println (a + ", " + b + ", " + c);
		
		checker(a,b,c);
	}
	
	
	public static boolean checker(boolean a, boolean b, boolean c) {
		
		do{
			if (b == c)
				b = a;
			else if (a == c)
				b = c;
			else
				a = c;
			
			System.out.println(a + ", " + b + ", " + c);
		}
	while ( a || b || c);
		return c;
		
	}
}
