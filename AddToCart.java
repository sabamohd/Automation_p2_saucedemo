package Selenium_Project_2_SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCart {
	WebDriver driver;

	By UserName = By.id("user-name");
	By password = By.id("password");
	By login = By.id("login-button");
	By AddToCart = By.id("add-to-cart-sauce-labs-backpack");

	public AddToCart(WebDriver driver3) {
		driver = driver3;
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
	
	public void AddToCart() {
		driver.findElement(AddToCart).click();
	}
}
