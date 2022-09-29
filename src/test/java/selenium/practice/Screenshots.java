package selenium.practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException {	
		File srcFile;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");	
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("https://www.saucedemo.com/");		
		srcFile = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./images/Launch_screenshot.png"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		srcFile = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./images/User_name_screenshot.png"));
		driver.findElement(By.id("password")).sendKeys("secret_sauce");	
		srcFile = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./images/Password_screenshot.png"));
		driver.executeScript("arguments[0].click();", driver.findElement(By.id("login-button")));
		srcFile = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./images/AfterLogin_screenshot.png"));
	}

}
