package testng.practice;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class TestNGParameters {
	
	@Parameters({"username","pwd"})
	@Test	
	public void testMethod(String uName, String password) {
		System.out.println("Enter Username: "+uName);
		System.out.println("Enter Password: "+password);
	}
	
	@Parameters({"a", "b"})
	@Test
	public void testAddFunction(String a, String b) {
		int c = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println("Answer is "+ c);
	}
	

}