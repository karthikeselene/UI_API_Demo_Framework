package testng.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	
	@Parameters({"carname"})
	@Test
	public void printCarsName(String name) {
		System.out.println("The car name is: "+name);
	}

}
