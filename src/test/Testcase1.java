package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.loginpage;

public class Testcase1 {
	
	WebDriver driver;
	
@BeforeMethod
public void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver","/home/shashikumartecn/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		
	}

	@Test
	public void LoginTest() {
		
		LoginPage obj = new LoginPage(driver);
		obj.Login("abxc@xyz.com","123abc");
	}
	
@AfterMethod
public void CloseBrowser() {
	
	driver.quit();

}


}
