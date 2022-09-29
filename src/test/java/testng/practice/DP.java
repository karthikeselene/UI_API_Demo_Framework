package testng.practice;

import org.testng.annotations.DataProvider;

public class DP {
	
	@DataProvider(name="credentials")
	public Object[][] testDatas(){
		return new Object[][] {
			{"admin", "admin123"},
			{"Maruthi", "Apache897654"}			
		};		
	}

}