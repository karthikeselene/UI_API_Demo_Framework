package selenium.practice;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String parentWindow = driver.getWindowHandle();
        System.out.println(driver.getTitle());
        driver.findElement(By.id("opentab")).click();
        Set<String> childWindows = driver.getWindowHandles();
//        for (String child : childWindows) {
//			if(!child.equals(parentWindow)) {
//				driver.switchTo().window(child);
//				System.out.println(driver.getTitle());
//			}
//		}
        ArrayList<String> lists = new ArrayList<String>(childWindows);
        driver.switchTo().window(lists.get(1));
        System.out.println(driver.getTitle());
	}

}