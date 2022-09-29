package com.dependency.injection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceDemoApp {
	
	private WebDriver driver;
	
	public SauceDemoApp(WebDriver driver) {
		this.driver = driver;
	}
	
	public void launchApp(String url) {
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void type(String locator, String input) {
		String[] ele = locator.split("=", 2);
		if(ele[0].equalsIgnoreCase("ID")) {
			driver.findElement(By.id(ele[1])).sendKeys(input);
		} else if(ele[0].equalsIgnoreCase("NAME")) {
			driver.findElement(By.name(ele[1])).sendKeys(input);
		}
	}
		
	public void click(String locator) {
		String[] ele = locator.split("=", 2);
		if(ele[0].equalsIgnoreCase("ID")) {
			driver.findElement(By.id(ele[1])).click();
		}
	}

}
