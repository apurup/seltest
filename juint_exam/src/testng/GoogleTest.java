package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;

public class GoogleTest {
	String driverPath = "C:\\Users\\apuru\\Downloads\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;

	@Test
	public void f() {
		driver.get("https://google.com");
		driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		
		}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", driverPath);
//		FirefoxOptions options = new FirefoxOptions();
//		options.setCapability("marionette", true);
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
