package Selenium_Project_2_SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyAddToCartPage {
	WebDriver driver;

	By UserName = By.id("user-name");
	By password = By.id("password");
	By login = By.id("login-button");
	By AddToCart = By.id("add-to-cart-sauce-labs-backpack");
	By CartLink = By.id("shopping_cart_container");
	By CartList = By.xpath("//h2[text()='Your Cart']");

	public VerifyAddToCartPage(WebDriver driver3) {
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

	public void CartLink() {
		driver.findElement(CartLink).click();
	}

	public void VerifyAddToCartPage() {
		driver.findElement(CartList).getText();
		

	}

}
