package junit.practice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitPractice {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Should run before all test method...");
	}
	
	@Before
	public void beforeEachMethod() {
		System.out.println("Should run before each test method...");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("First Test Method...");
	}
	
	@Ignore
	@Test
	public void testMethod2() {
		System.out.println("Second Test Method...");
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Third Test Method...");
	}
	
	@After
	public void afterEachMethod() {
		System.out.println("Should run after each test method...");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Should run after all test method...");
	}

}