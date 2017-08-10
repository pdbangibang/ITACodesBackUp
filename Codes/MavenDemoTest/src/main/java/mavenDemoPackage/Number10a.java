package mavenDemoPackage;

public class Number10a {
	
	public static void main(String[] args)
	{
		double count;
		int limit;
		boolean check = false;
		count = 9.0;
		limit = 43/4;
			for (; count <= limit; count = count + 0.5)
			{
				System.out.println ("in for:" + count);
			}
			System.out.println ("after for" + count);
			
			if(count == 10.5) {
				checking(true);
			}
	}
	
	public static boolean checking(boolean check) {
		return check;
		
	}
}

