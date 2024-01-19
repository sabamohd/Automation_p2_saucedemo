package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InCorrectUserID {
	WebDriver driver;
	By UserName = By.id("user-name");
	By password = By.id("password");
	By login = By.id("login-button");

	public InCorrectUserID(WebDriver d) {
		driver = d;
	}

	public void enterUserName() {
		driver.findElement(UserName).sendKeys("saba");
	}

	public void enterpassword() {
		driver.findElement(password).sendKeys("secret_sauce");
	}

	public void clickonlogin() {
		driver.findElement(login).click();
	}
	

}
