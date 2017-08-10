package com.oocl;

import static org.junit.Assert.*;

import org.junit.Test;

public class Number7 {

	@Test //annotation 
	public void test() {
		
		int first = 4;
		int second = 2;
		int [] expectedresults = new int[] {6, 2, 8, 2};
		
		
		int [] results = new int[4];
		App calc = new App();
		
		results[0] = calc.add(first, second);
		results[1] = calc.subtract(first, second);
		results[2] = calc.multiply(first, second);
		results[3] = calc.divide(first, second);
		
		
		assertArrayEquals(expectedresults, results);
	}

}
