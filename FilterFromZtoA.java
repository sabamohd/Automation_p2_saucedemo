package Selenium_Project_2_SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FilterFromZtoA {
	WebDriver driver;
	By UserName = By.id("user-name");
	By password = By.id("password");
	By login = By.id("login-button");
    By FilterZtoA = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
	public FilterFromZtoA(WebDriver driver7) {
		driver = driver7;
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
	public void FilterZtoA() {
		WebElement dropdown = driver.findElement(FilterZtoA);
		Select sel = new Select(dropdown);
		sel.selectByIndex(1);
	}

}
