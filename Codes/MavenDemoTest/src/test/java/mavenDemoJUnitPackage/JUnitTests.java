package mavenDemoJUnitPackage;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.Test;

import mavenDemoPackage.Number1;
import mavenDemoPackage.Number10a;
import mavenDemoPackage.Number10b;
import mavenDemoPackage.Number10c;
import mavenDemoPackage.Number10d;
import mavenDemoPackage.Number10e;
import mavenDemoPackage.Number2;
import mavenDemoPackage.Number3;
import mavenDemoPackage.Number4;
import mavenDemoPackage.Number7;

public class JUnitTests {

	@Test
	public void test7() {
		int [] expected = {62, 31, 10, 2, 0};	
		int[] temp;

		Number7 testClass = new Number7();
		
		temp = testClass.compute_value(60);
		assertArrayEquals(expected, temp);
		
	}
	
	@Test
	public void test1() {

		boolean result;
		
		result = Number1.cases(1);
		assertTrue(result);
		
	}
	
	@Test
	public void test2() {
		
		int result;
		
		result = Number2.run(5);
		assertEquals(8, result);
		
	}
	
	@Test
	public void test3() {
		
		int result;
		
		result = Number3.method(2, 2);
		assertEquals(26, result);
		
	}
	
	@Test
	public void test4() {
		
		List<String> expected = Arrays.asList("Hello", "Hello", "Hello", "Hello");//{"Hello", "Hello", "Hello", "Hello"};
		Number4 test4 = new Number4();
		List<String> result = test4.compileHello(3, 10);
		
		//ertArrayEquals(expected, result);
		assertThat(expected, is(result));
		
	}
	
	@Test
	public void test10a() {
		
		boolean result;
		
		result = Number10a.checking(true);
		assertTrue(result);
		
	}
	
	@Test
	public void test10b() {
		
		int[] expected = {100, 6};
		int[] result = new int [2];
		
		
		result[0] = Number10b.p1(10);
		result[1] = Number10b.p2(30);
		assertArrayEquals(expected, result);
		
	}
	
	@Test
	public void test10c() {
		
		int expected = 5;
		int result;
		
		
		result = Number10c.totalNum(5, 1);
		assertEquals(expected, result);
		
	}
	
	@Test
	public void test10d() {

		boolean result;
		
		result = Number10d.checker(true, false, false);
		assertFalse(result);
		
	}
	
	@Test
	public void test10e() {

		String expected = "cartcartoon";
		
		
		String result = Number10e.check(1, 2, 3);
		assertEquals(expected, result);
		
	}

}
