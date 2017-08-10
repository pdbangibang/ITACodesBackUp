package Day6_exercise2;

public class ExceptionHandling {

	public static void main(String args[]) {

		FiboClass call = null;
		try {
			call.method();
		} catch(Exception e) {
			 System.out.print(e);
			
		}
	}
	
	
}
