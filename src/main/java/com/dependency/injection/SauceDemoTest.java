package com.dependency.injection;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemoTest {

	SauceDemoApp app;
	
	@Parameters({"browser"})
	@BeforeMethod
	public void beforeMethod(String browser) {
		if(browser.equalsIgnoreCase("FIREFOX")) {
			WebDriverManager.firefoxdriver().setup();
			app = new SauceDemoApp(new FirefoxDriver());			
		} else if (browser.equalsIgnoreCase("CHROME")) {
			WebDriverManager.chromedriver().setup();
			app = new SauceDemoApp(new ChromeDriver());
		}
		
	}
	
	@Test
	public void test_SauceDemo() {
		app.launchApp("https://www.saucedemo.com/");
		app.type("id=user-name", "standard_user");
		app.type("id=password", "secret_sauce");
		app.click("id=login-button");
	}

}
