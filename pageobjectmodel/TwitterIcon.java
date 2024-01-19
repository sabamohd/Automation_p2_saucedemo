package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TwitterIcon {

	WebDriver driver;
	By UserName = By.id("user-name");
	By password = By.id("password");
	By login = By.id("login-button");
	By TwitterIcon = By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[1]/a");
	

	public TwitterIcon(WebDriver d) {
		driver = d;
	}

	public void enterUserName() {
		driver.findElement(UserName).sendKeys("standard_user");
	}

	public void enterpassword() {
		driver.findElement(password).sendKeys("secret_sauce");
	}

	public void clickonlogin() {
		driver.findElement(login).click();

	}

	private void scrollDownToBottom(WebDriver driver2) {
		scrollDownToBottom(driver);

	}
	public void TwitterIcon() {
		driver.findElement(TwitterIcon).click();
		
	}

}
