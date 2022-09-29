package junit.practice;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SauceDemoTest {
	
	ChromeDriver driver = null;
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
	@Test
	public void tc001_LoginTestCase() {		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		boolean actual = driver.getCurrentUrl().contains("inventory");
		Assert.assertEquals(actual, true);		
	}	
	
	@Test
	public void tc002_LoginTestCase() {		
		driver.findElement(By.id("user-name")).sendKeys("standard_userq");
		driver.findElement(By.id("password")).sendKeys("secret_sauceq");
		driver.findElement(By.id("login-button")).click();
		boolean actual = driver.findElement(By.tagName("h3")).getText().equals("Epic sadface: Username and password do not match any user in this service");
		Assert.assertEquals(actual, true);
	}	

}