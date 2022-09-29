package selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioCheckBoxDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		if(!driver.findElement(By.xpath("//input[@value='radio1']")).isSelected()) {
			driver.findElement(By.xpath("//input[@value='radio1']")).click();
		}
		if(!driver.findElement(By.id("checkBoxOption3")).isSelected()) {
			driver.findElement(By.id("checkBoxOption3")).click();
		}
		Select dropDown = new Select(driver.findElement(By.id("dropdown-class-example")));
		Thread.sleep(2000);
		//dropDown.selectByIndex(1);
		//dropDown.selectByValue("option2");
		dropDown.selectByVisibleText("Option3");
	}

}
