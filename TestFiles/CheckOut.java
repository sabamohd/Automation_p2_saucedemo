package TestFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut {
	WebDriver driver;

	By UserName = By.id("user-name");
	By password = By.id("password");
	By login = By.id("login-button");
	By AddToCart = By.id("add-to-cart-sauce-labs-backpack");
	By CartLink = By.id("shopping_cart_container");
	By CheckOut = By.xpath("//*[@id=\"checkout\"]");
	By FirstName = By.xpath("//*[@id=\"first-name\"]");
	By LastName = By.id("last-name");
	By ZipCode = By.id("postal-code");
    By Continue = By.id("continue");
    By Finish = By.id("finish");
    By BackHome = By.id("back-to-products");
	public CheckOut(WebDriver driver6) {
		driver = driver6;
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
	
	public void CheckOut() {
		driver.findElement(CheckOut).click();
	}
	public void FirstName() {
		driver.findElement(FirstName).sendKeys("saba");
	}
	public void LastName() {
		driver.findElement(LastName).sendKeys("kausar");
    }
	public void ZipCode() {
		driver.findElement(ZipCode).sendKeys("12345566");
    }
	public void Continue() {
		driver.findElement(Continue).click();
    }
	public void Finish() {
		driver.findElement(Finish).click();
    }
	public void BackHome() {
		driver.findElement(BackHome).click();
	}
}
