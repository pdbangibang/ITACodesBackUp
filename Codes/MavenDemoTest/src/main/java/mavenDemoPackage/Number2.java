package mavenDemoPackage;

import java.util.Scanner;

public class Number2 {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter the number");
		n=input.nextInt();
			run(n);
			}

	
	public static int run(int n) {
		
		int F_0=1,F_1=1;
		int F_n=0;
		
		for (int i=1; i<n; i++)
		{
		F_n=F_0+F_1;
		F_0=F_1;
		F_1=F_n;
		}
		System.out.println (F_n);
		return F_n;
	}

}
