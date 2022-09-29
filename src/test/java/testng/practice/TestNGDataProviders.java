package testng.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviders {
	
	@DataProvider
	public Object[][] testDatas(){
		return new Object[][] {
			{"BMW", "RC", 122345},
			{"Maruthi", "Apache", 897654},
			
		};		
	}
	
	@DataProvider(name = "integersData")
	public Object[][] testNumDatas(){
		return new Object[][] {
			{20, 10},
			{3, 4}
		};
	}
	
	@Test(dataProvider = "testDatas")
	public void testMethod(String carName, String bikeName, int modleNum) {
		System.out.println("The car name is: "+carName);
		System.out.println("The bike name is: "+bikeName);
		System.out.println("The model num is: "+modleNum);
	}
	
	@Test(dataProvider = "integersData")
	public void testAddMethod(int a, int b) {
		int c = a + b;
		System.out.println("The answer is: "+c);
	}
	
	@Test(dataProvider = "credentials", dataProviderClass = DP.class)
	public void testLoginPage(String uName, String pwd) {
		System.out.println("Enter Username: "+uName);
		System.out.println("Enter Password: "+pwd);
	}

}