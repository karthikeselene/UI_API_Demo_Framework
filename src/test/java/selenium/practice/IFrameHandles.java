package selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameHandles {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.get("https://jqueryui.com/slider/");
		//driver.get("https://jqueryui.com/droppable/");
		driver.get("https://jqueryui.com/droppable/");		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);


		//		Actions actions = new Actions(driver);
		//		actions.moveToElement(driver.findElement(By.id("courses-iframe"))).build().perform();
		//		Thread.sleep(2000);
		//		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
		//		driver.findElement(By.linkText("Courses")).click();
		//		driver.switchTo().parentFrame();

		//		driver.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']")));
		//		Actions actions = new Actions(driver);
		//		actions.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		//		Thread.sleep(2000);
		//		actions.moveToElement(driver.findElement(By.linkText("Top"))).click().build().perform();

		//		driver.get("https://www.toolsqa.com/");
		//		actions.contextClick(driver.findElement(By.xpath("//ul[contains(@class, 'navbar__links')]/li/a[text()='Demo Site']")))
		//		       .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		//		driver.get("https://demoqa.com/buttons");
		//		actions.doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();
		//		System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
		//		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		//		Actions actions = new Actions(driver);
		//		actions.clickAndHold(driver.findElement(By.xpath("//div[@id='slider']/span"))).moveByOffset(40, 0).release().perform();
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		Actions actions = new Actions(driver);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(draggable, droppable).perform();

	}

}
