package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedinIcon {
	WebDriver driver;
	By UserName = By.id("user-name");
	By password = By.id("password");
	By login = By.id("login-button");
	By LinkedinIcon = By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[3]/a");
	

	public LinkedinIcon(WebDriver d) {
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
	public void LinkedinIcon() {
		driver.findElement(LinkedinIcon).click();
		
	}


}
