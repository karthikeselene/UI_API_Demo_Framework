package selenium.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		//driver.get("https://qeagle-dev-ed.lightning.force.com/lightning/o/Account/list?filterName=Recent");
		driver.get("https://qeagle-dev-ed.lightning.force.com/lightning/o/Dashboard/home?queryScope=mru");
		driver.findElementById("username").sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElementById("password").sendKeys("India$321");
		driver.findElementById("Login").click();
		Thread.sleep(7000);
		driver.executeScript("arguments[0].scrollIntoView();", driver.findElementByXPath("//table/tbody/tr[1]/td[6]"));
		driver.executeScript("arguments[0].click();", driver.findElementByXPath("//table/tbody/tr[1]/td[6]/descendant::button"));
		Thread.sleep(1000);
		List<WebElement> eles = driver.findElementsByXPath("//table/tbody/tr[1]/td[6]/descendant::button/following-sibling::div/descendant::a");
		for (WebElement ele : eles) {
			if(ele.getText().equals("Edit")) {
				driver.executeScript("arguments[0].click();", ele);
				break;
			}
		}
		//		int i = 1;
		//		try {
		//			while (driver.findElementByXPath("//table/tbody/tr["+i+"]").isDisplayed()) {
		//				driver.executeScript("arguments[0].scrollIntoView();", driver.findElementByXPath("//table/tbody/tr["+i+"]"));
		//				i++;
		//			}
		//		} catch (NoSuchElementException e) {}
		//			
		//        System.out.println(driver.findElements(By.xpath("//table/tbody/tr")).size());		
		//		List<WebElement> elements = driver.findElements(By.xpath("//table/tbody/tr"));
		//		Thread.sleep(5000);
		//		int rowCount = elements.size();		
		//		driver.executeScript("arguments[0].scrollIntoView();", driver.findElementByXPath("//table/tbody/tr[14]"));
		//		Thread.sleep(2000);
		//		System.out.println(driver.findElementByXPath("//table/tbody/tr[15]").isEnabled());
		//		System.out.println(elements.size());

	}

}
