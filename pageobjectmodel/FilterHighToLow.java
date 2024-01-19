package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FilterHighToLow {
	WebDriver driver;
	By UserName = By.id("user-name");
	By password = By.id("password");
	By login = By.id("login-button");
    By Filter = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
	public FilterHighToLow(WebDriver driver7) {
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
	public void FilterHighToLow() {
		WebElement dropdown = driver.findElement(Filter);
		Select sel = new Select(dropdown);
		sel.selectByIndex(3);
	}

}
