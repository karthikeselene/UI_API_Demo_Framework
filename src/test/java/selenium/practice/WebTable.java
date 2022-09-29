package selenium.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[2]/td[2]"));
		//		Actions action = new Actions(driver);
		//		action.moveToElement(ele).build().perform();
		String text = ele.getText();
		//System.out.println(text);
		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		List<WebElement> colCount = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[1]/th"));
		List<WebElement> headers = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[1]/th"));
		for (WebElement header : headers) {
			System.out.println(header.getText());
		}
		for (int i = 2; i <= rowCount.size(); i++) {			
			for (int j = 1; j <= colCount.size(); j++) {				
				if(j == 2) {					
					System.out.println(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/td["+j+"]")).getText());
				}				
			}
		}
		for (int i = 2; i <= rowCount.size(); i++) {
			if (driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/td[2]")).getText().equals("Learn JMETER from Scratch - (Performance + Load) Testing Tool")) {
				System.out.println(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/td[3]")).getText());
				break;
			}
		}
	}

}
