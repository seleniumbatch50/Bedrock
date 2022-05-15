package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage extends Base{


	@Test(groups="High")
	public void testToClickForgottenPassword() {

		WebElement forgottenPasswordLink =  driver.findElement(By.linkText("Forgotten password?"));
		forgottenPasswordLink.click();
	}

	/*
	@Test(groups="Medium")
	public void testLogin() {

		WebElement emailField = driver.findElement(By.id("email"));
		emailField.clear();
		emailField.sendKeys("SeleniumBatch52");

		WebElement passwordField = driver.findElement(By.name("pass"));
		passwordField.clear();
		passwordField.sendKeys("123456");

		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
	}

	@Test(groups="High")
	public void testSignUp() {

		WebElement createNewAccountButton = driver.findElement(By.xpath("//div[@class='_6ltg']/a"));
		createNewAccountButton.click();

	}

	 */

}
