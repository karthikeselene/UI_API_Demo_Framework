package selenium.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");	
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("(//div[@class='w3-example'])[1]")));
		WebElement table = driver.findElement(By.id("customers"));		
		WebElement tbody = table.findElement(By.xpath("//table[@id='customers']/tbody"));
		int rowsCount = tbody.findElements(By.tagName("tr")).size();
		List<WebElement> rows = tbody.findElements(By.tagName("tr"));
		int colCount = rows.get(1).findElements(By.tagName("td")).size();
		for (int i = 0; i < rowsCount; i++) {
			//System.out.println(rows.get(i).findElement(By.tagName("td")).getText());
			for (int j = 0; j < colCount; j++) {
				if(i == 0) {
					System.out.print(rows.get(i).findElements(By.tagName("th")).get(j).getText()+ " | ");					
				} else {
					System.out.print(rows.get(i).findElements(By.tagName("td")).get(j).getText()+ " | ");
				}
				
			}
			System.out.println(" ");
		}
		
	}

}
