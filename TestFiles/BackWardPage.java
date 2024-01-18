package TestFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BackWardPage {
	
	WebDriver driver;

	By UserName = By.id("user-name");
	By password = By.id("password");
	By login = By.id("login-button");
	By MenuButton = By.id("react-burger-menu-btn");
	By About = By.id("about_sidebar_link");

	public BackWardPage(WebDriver driver2) {
		driver = driver2;
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

	public void clickOnMenuButton() {
		driver.findElement(MenuButton).click();
	}
    public void aboutButton() {
    	driver.findElement(About).click();
    }

}
