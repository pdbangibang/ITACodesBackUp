package Day3_exercise4;

import java.util.Scanner;

public class FiboClass {

	public static void main(String[] args) {
		
		for (long i = 1; i < 100; i++) {
			
			if(fibonacci(i)<100) {
				System.out.print(fibonacci(i) + " ");
			}
			
		}

	}
		
	public static long fibonacci(long num) {
		if(num == 0){
			return 0;
		}
		else if (num == 1 || num == 2) {
			return 1;
		}
 
		return fibonacci(num - 1) + fibonacci(num - 2); 
	}
	
	
	
}
