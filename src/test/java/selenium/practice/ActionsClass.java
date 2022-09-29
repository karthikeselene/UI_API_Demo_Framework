package selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.get("https://jqueryui.com/droppable/");
		driver.get("https://www.toolsqa.com/");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
			
		Actions actions = new Actions(driver);

		//		driver.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']")));
		//		actions.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		//		Thread.sleep(2000);
		//		actions.moveToElement(driver.findElement(By.linkText("Top"))).click().build().perform();
		//		
		//		driver.get("https://www.toolsqa.com/");
		//		actions.contextClick(driver.findElement(By.xpath("//ul[contains(@class, 'navbar__links')]/li/a[text()='Demo Site']")))
		//		      .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		//		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		//		actions.clickAndHold(driver.findElement(By.xpath("//div[@id='slider']/span"))).moveByOffset(40, 0).release().build().perform();

		//		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		//		WebElement draggable = driver.findElement(By.id(("draggable")));
		//		WebElement droppable = driver.findElement(By.id("droppable"));
		//
		//		actions.dragAndDrop(draggable, droppable).build().perform();

		//		driver.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']")));
		//		actions.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		//		Thread.sleep(2000);
		//		actions.moveToElement(driver.findElement(By.linkText("Top"))).click().build().perform();
		//		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//		WebElement draggable = driver.findElement(By.id("draggable"));
		//		WebElement droppable = driver.findElement(By.id("droppable"));
		//		actions.dragAndDrop(draggable, droppable).build().perform();
		actions.contextClick(driver.findElement(By.xpath("//ul[contains(@class, 'navbar__links')]/li/a[text()='Demo Site']")))
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

}