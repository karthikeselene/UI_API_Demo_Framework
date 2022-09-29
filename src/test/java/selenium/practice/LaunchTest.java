package selenium.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTest {

	public static void main(String[] args) {
		//Set path to the chrome driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		//Used to launch the chrome test browser
		ChromeDriver driver= new ChromeDriver();
		//Browser Maximize
		driver.manage().window().maximize();
		//Launch web application in the browser
		driver.get("https://www.saucedemo.com/");
		//Timeout - Wait until within given time to element load
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Type user name in the username text box
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//Type password in the password text box
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//Click on the login button
		//driver.findElement(By.id("login-button")).click();
		driver.executeScript("arguments[0].click();", driver.findElement(By.id("login-button")));
		
		List<WebElement> items = driver.findElements(By.className("inventory_item_name"));
		System.out.println(items.size());
		for (WebElement item : items) {
			System.out.println(item.getText());
		}
		
		for (WebElement item : items) {
			if(item.getText().equals("Sauce Labs Fleece Jacket")) {
				item.click();
				if(driver.findElement(By.xpath("//div[@class='inventory_details_name large_size']")).getText().equals("Sauce Labs Fleece Jacket")) {
					System.out.println("Testcase PASSED!!!");
				} else {
					System.out.println("Testcase FAILED!!!");
				}
				break;
			}
		}
		
		//Close the browser
		driver.quit();
	}

}
