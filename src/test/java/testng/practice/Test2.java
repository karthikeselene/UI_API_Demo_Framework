package testng.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	
	@Parameters({"bikename"})
	@Test
	public void printTwoWheelerName(String name) {
		System.out.println("The bike name is "+name);
	}

}
