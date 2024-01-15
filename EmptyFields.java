package Selenium_Project_2_SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmptyFields {
	WebDriver driver;
	By UserName = By.id("user-name");
	By password = By.id("password");
	By login = By.id("login-button");

	public  EmptyFields(WebDriver d) {
		driver = d;
	}

	public void enterUserName() {
		driver.findElement(UserName).sendKeys("");
	}

	public void enterpassword() {
		driver.findElement(password).sendKeys("");
	}

	public void clickonlogin() {
		driver.findElement(login).click();
	}

}
