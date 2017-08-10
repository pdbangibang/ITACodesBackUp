package mavenDemoPackage;

import java.util.ArrayList;
import java.util.List;

public class Number4 {

	public static void main(String[] args) {
		
		int x =3;
		int y = 10;
		
		compileHello(x,y);

	}
		
	public static List<String> compileHello(int x, int y) {
		//String [] returns = {};
		 List<String> returns = new ArrayList<String>();

		int i =0;
		while (x < y)
		{System.out.println ("Hello");
		x = x + 1;
		y =y - 1;
		++i;
		returns.add("Hello");
	}
		return returns;

}
}
