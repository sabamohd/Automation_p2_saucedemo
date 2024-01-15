
package Selenium_Project_2_SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartLink {
	
	WebDriver driver;

	By UserName = By.id("user-name");
	By password = By.id("password");
	By login = By.id("login-button");
	By AddToCart = By.id("add-to-cart-sauce-labs-backpack");
	By CartLink = By.id("shopping_cart_container");

	public CartLink(WebDriver driver5) {
		driver = driver5;
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

}
