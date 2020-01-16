package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;

public class FacebookTest {
	String driverPath = "C:\\Users\\apuru\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe";
	WebDriver driver;

	@Test
	public void f() {
		driver.get("https://facebook.com");

	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver", driverPath);
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", true);
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
