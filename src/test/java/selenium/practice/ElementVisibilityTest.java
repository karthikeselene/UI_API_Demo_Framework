package selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementVisibilityTest {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "<driver_path>");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		WebElement ele = driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
		driver.executeScript("arguments[0].scrollIntoView();", ele);
		
		System.out.println(driver.findElement(By.id("displayed-text")).isEnabled());
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("displayed-text")).isEnabled());
		System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());		

	}

}
