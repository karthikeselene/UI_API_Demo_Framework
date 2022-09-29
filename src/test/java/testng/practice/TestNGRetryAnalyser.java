package testng.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryAnalyser {
	
	@Test
	public void tc001() {
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void tc002() {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void tc003() {
		String str = "Account \"00125\" was created";
		boolean actual = str.matches("Account \"([0-9]+)\" was created");
		Assert.assertEquals(actual, true);
	}

}
