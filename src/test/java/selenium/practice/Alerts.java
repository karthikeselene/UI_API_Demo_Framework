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

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//TakesScreenshot ts = (TakesScreenshot) driver;
		//File src1 = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./images/FirstScreenShot.png"));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./images/SecondScreenShot.png"));
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("name")).sendKeys("Karthikeyan");
        driver.findElement(By.id("alertbtn")).click();
        String text = driver.switchTo().alert().getText();
        if(text.contains("Karthikeyan"))
        	System.out.println("PASS");
        else
        	System.out.println("FAIL");				
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		System.out.println(driver.getTitle());
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("Karthikeyan");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("result")).getText());
	}

}
