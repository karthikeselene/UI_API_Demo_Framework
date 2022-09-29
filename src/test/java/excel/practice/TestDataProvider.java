package excel.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDataProvider {

	@DataProvider
	public Object[][] fetchData(){
		return ReadExcel.getTestData("Credentials","Login");		
	}
	
	@DataProvider
	public Object[][] fetchData1(){
		return ReadExcel.getTestData("Data","Sheet1");		
	}

	@Test(dataProvider = "fetchData")
	public void test(String uName, String pwd) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("user-name")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		System.out.println("title of page is: " + driver.getTitle());		 
		driver.quit();
	}
	
	@Test(dataProvider = "fetchData1")
	public void test001(String name) {
		System.out.println(name);
	}

}
