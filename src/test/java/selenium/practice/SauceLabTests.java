package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SauceLabTests {
	
	private static final String USERNAME = "oauth-karan.sudha-75c82";
	private static final String ACCESS_KEY = "e0534aa5-7cac-41e8-bfd1-f4cb6ce8eecd";
	private static final String URL = "https://"+USERNAME+":"+ACCESS_KEY+"@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

	public static void main(String[] args) throws MalformedURLException {	
		
		
		
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
	    //caps.setCapability("platform", "Linux");
	    //caps.setCapability("platform", "macOS 10.13");	   
		caps.setCapability("version", "latest");
		caps.setCapability("name", "SauceLabTests");
		
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

	    driver.get("https://www.saucedemo.com/");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    driver.findElement(By.id("login-button")).click();
	    System.out.println("title of page is: " + driver.getTitle());
	 
	    driver.quit();

	}

}