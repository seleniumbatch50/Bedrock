package base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Base {

	public WebDriver driver;
	public String propertyFile;

	@BeforeMethod
	public void setUp() throws IOException {


		//System.setProperty("webdriver.chrome.driver", "D:\\Batch 52\\Selenium\\Drivers\\chromedriver_win32 (5)\\chromedriver.exe");
		//driver = new ChromeDriver();

		driver = new RemoteWebDriver(new URL("http://192.168.103.146:4444/wd/hub"), DesiredCapabilities.chrome());

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(630,TimeUnit.SECONDS);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
