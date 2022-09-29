package selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDownUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		//Scroll into particular element
		//driver.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//legend[text()='Web Table Example']")));
		//Scroll up and down using scrollBy method
		//driver.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);
		//driver.executeScript("window.scrollBy(0,-250)");
		//Scroll down to the bottom of the webpage 
		driver.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}
