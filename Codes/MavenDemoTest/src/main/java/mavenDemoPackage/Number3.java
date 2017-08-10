package mavenDemoPackage;

public class Number3 {

	public static void main(String[] args) {
		
		int inner=2, outer=2;
		
		
		method(inner, outer);
	}
	
	public static int method(int inner, int outer) {
		int result =0;
		for (int i=0; i<outer; i++)
		{
		for (int j=0; j<inner; j++)
		{
		result = (result*result)+1;
		}
		}
	
		return result;
	}

}
