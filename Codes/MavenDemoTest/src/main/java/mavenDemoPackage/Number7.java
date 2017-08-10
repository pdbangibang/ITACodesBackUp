package mavenDemoPackage;

public class Number7 {

	public static void main(String[] args) {
	//compute_value(60);
		
		}

	public int[] compute_value(int integer_value) {
		// Declare Local Variables
			boolean done = false; 
			int count = 1; 
			int current = integer_value + 2;
			int [] tempCur = new int [5];
		while (! done) {
			
			
			current = current / count; 
			tempCur[count-1]= current;
			
				if (current % 3 == 0) 
					done = true; 
				else if (current < 1) 
					done = true; 
				else count += 1; 
				
				System.out.print(current + " "); 
			//	tempCur[count-1]= current;
				
		}
	
		System.out.print(count); 
		return tempCur;
		}

}
