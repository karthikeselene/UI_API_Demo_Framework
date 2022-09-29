package selenium.practice;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebLocators {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String parentWindow = driver.getWindowHandle();
		
//		Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
//		select.selectByIndex(1);
//		Thread.sleep(3000);
//		select.selectByValue("option3");
//		Thread.sleep(3000);
//		select.selectByVisibleText("Option2");
//		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("openwindow")).click();
		Set<String> windows = driver.getWindowHandles();
//		for (String window : windows) {
//			if(!window.equals(parentWindow)) {
//				driver.switchTo().window(window);
//				System.out.println(driver.getTitle());
//			}
//		}
		ArrayList<String> list = new ArrayList<String>(windows);
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
//		driver.findElement(By.id("opentab")).click();
//		Set<String> tabs = driver.getWindowHandles();
//		for (String tab : tabs) {
//			if(!tab.equals(parentWindow)) {
//				driver.switchTo().window(tab);
//				System.out.println(driver.getTitle());
//			}
//		}
//		ArrayList<String> list = new ArrayList<String>(tabs);
//		driver.switchTo().window(list.get(1));
//		driver.close();
//		driver.switchTo().window(parentWindow);
//		System.out.println(driver.getTitle());
	}

}
