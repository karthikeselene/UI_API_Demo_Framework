package selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		// import org.openqa.selenium.JavascriptExecutor;
		// JavascriptExecutor js = (JavascriptExecutor) driver; 
		
		WebElement uName = driver.findElement(By.id("user-name"));
		WebElement pwd = driver.findElement(By.id("password"));
		WebElement lbutton = driver.findElement(By.id("login-button"));
		
		driver.executeScript("document.getElementById('user-name').value='standard_user';");	
		//driver.executeScript("arguments[0].value='user-name';", uName);
		driver.executeScript("document.getElementById('password').value='secret_sauce';");
		//driver.executeScript("arguments[0].value='secret_sauce';", pwd);
		
		//driver.executeScript("document.getElementById('login-button').click();");
		//driver.executeScript("arguments[0].click();", lbutton); -> To Click on a Button
		//"document.getElementById('enter element id').checked=false;" -> To Handle Checkbox by passing the value as true or false
		//alert('Welcome To Selenium Testing'); -> To generate Alert Pop window in Selenium Webdriver
		//history.go(0) -> To refresh browser window using Javascript
		
		// To get the innertext of the entire webpage in Selenium
		// return document.documentElement.innerText; <a>link</a>
		// To get the Title of our webpage
		// return document.title;
		// To get the domain name
		// return document.domain;
		// To get the URL of a webpage
		// return document.URL;
		// To get the Height and Width of a web page
		// return window.innerHeight; return window.innerWidth;
		// To navigate to a different page using Javascript
		// window.location = 'https://www.lambdatest.com'
		// To scroll the page vertically for 500px
		// window.scrollBy(0,500);
		// To scroll the page vertically till the end
		// window.scrollBy(0,document.body.scrollHeight);
		// To scroll to the particular element
		// arguments[0].scrollIntoView();
		
		
		

	}

}
