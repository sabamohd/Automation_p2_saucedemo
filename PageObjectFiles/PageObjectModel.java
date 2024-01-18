package PageObjectFiles;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import TestDataFiles.DataDriverFrameWork;
import TestFiles.AboutSauceLabsButton;
import TestFiles.AddToCart;
import TestFiles.BackWardPage;
import TestFiles.CartLink;
import TestFiles.CheckOut;
import TestFiles.EmptyFields;
import TestFiles.FacebookIcon;
import TestFiles.FilterFromZtoA;
import TestFiles.FilterHighToLow;
import TestFiles.FilterPriceLowToHigh;
import TestFiles.InCorrectUserID;
import TestFiles.LinkedinIcon;
import TestFiles.LogOut;
import TestFiles.LoginPage;
import TestFiles.RemoveProductsFromCart;
import TestFiles.TwitterIcon;
import TestFiles.VerifyAddToCartPage;

public class PageObjectModel {

	
	WebDriver driver;

	@Test

	void homepage() throws InterruptedException {
		String url = "https://www.saucedemo.com/";
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.saucedemo.com/");
			System.out.println(driver.getCurrentUrl());
			// LogIn
			LoginPage LoginPage = new LoginPage(driver);
			LoginPage.enterUserName();
			LoginPage.enterpassword();
			LoginPage.clickonlogin();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("Successfully LoggedIn");
			// Log Out
			LogOut LogOut = new LogOut(driver);
			LogOut.clickOnMenuButton();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			LogOut.clickOnLogOutButton();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("Successfully LoggedOut");

			driver.get("https://www.saucedemo.com/");
			LoginPage LoginPage1 = new LoginPage(driver);
			LoginPage1.enterUserName();
			LoginPage1.enterpassword();
			LoginPage1.clickonlogin();
			// Add To Cart
			AddToCart AddToCart = new AddToCart(driver);
			AddToCart.AddToCart();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("Successfully AddedProductToCart");
			// Click On CART LINK
			CartLink CartLink = new CartLink(driver);
			CartLink.CartLink();
			// Remove Products

			RemoveProductsFromCart RemoveProductsFromCart = new RemoveProductsFromCart(driver);
			RemoveProductsFromCart.RemoveProductsFromCart();
			System.out.println("Successfully Removed Product From Cart");

			// CheckOut
			CheckOut CheckOut = new CheckOut(driver);
			CheckOut.CheckOut();
			driver.getTitle();
			CheckOut.FirstName();
			CheckOut.LastName();
			CheckOut.ZipCode();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			CheckOut.Continue();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			CheckOut.Finish();
			driver.getTitle();
			CheckOut.BackHome();
			System.out.println("Successfully CheckedOut");
			// select filter Z to A
			// driver.get(url);
			FilterFromZtoA FilterFromZtoA = new FilterFromZtoA(driver);
			FilterFromZtoA.FilterZtoA();
			System.out.println("Filter From Z to A is Displayed");
			// Filter Price LOW to HIGH
			FilterPriceLowToHigh FilterPriceLowToHigh = new FilterPriceLowToHigh(driver);
			FilterPriceLowToHigh.FilterPriceLowToHigh();
			System.out.println("Filter Price Low To High is Displayed");
			// Filter Price HIGH TO LOW
			FilterHighToLow FilterHighToLow = new FilterHighToLow(driver);
			FilterHighToLow.FilterHighToLow();
			System.out.println("Filter Price High To Low is Displayed");
			// Incorrect USER ID
			driver.get(url);
			InCorrectUserID InCorrectUserID = new InCorrectUserID(driver);
			InCorrectUserID.enterUserName();
			InCorrectUserID.enterpassword();
			InCorrectUserID.clickonlogin();
			System.out.println(driver.getTitle());
			// Check for error message
			WebElement errorMessageElement = driver
					.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));

			if (errorMessageElement.isDisplayed()) {
				// Print the error message to the console
				System.out.println("Login failed. Error message: " + errorMessageElement.getText());
			} else {
				System.out.println("Login successful.");
			}
			// Empty Field
			driver.get(url);
			EmptyFields EmptyFields = new EmptyFields(driver);
			EmptyFields.enterUserName();
			EmptyFields.enterpassword();
			EmptyFields.clickonlogin();
			WebElement errorMessageElement1 = driver
					.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));

			if (errorMessageElement1.isDisplayed()) {
				// Print the error message to the console
				System.out.println("Login failed. Error message: " + errorMessageElement1.getText());
			} else {
				System.out.println("Login successful.");
			}

			// About Sauce Labs Button
			driver.get(url);
			LoginPage LoginPage2 = new LoginPage(driver);
			LoginPage2.enterUserName();
			LoginPage2.enterpassword();
			LoginPage2.clickonlogin();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			AboutSauceLabsButton AboutSauceLabsButton = new AboutSauceLabsButton(driver);
			AboutSauceLabsButton.clickOnMenuButton();
			AboutSauceLabsButton.aboutButton();
			System.out.println("Landed at About SauceLabs Page");
			// BackWardPage
			driver.get(url);
			BackWardPage BackWardPage = new BackWardPage(driver);
			BackWardPage.enterUserName();
			BackWardPage.enterpassword();
			BackWardPage.clickonlogin();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			BackWardPage.clickOnMenuButton();
			BackWardPage.aboutButton();
			driver.navigate().back();
			System.out.println("Successfully loaded Back Page");
			// Twitter Icon
			driver.get(url);
			TwitterIcon TwitterIcon = new TwitterIcon(driver);
			TwitterIcon.enterUserName();
			TwitterIcon.enterpassword();
			TwitterIcon.clickonlogin();
			TwitterIcon.TwitterIcon();
			System.out.println(driver.getCurrentUrl());
			System.out.println("Successfully launched Twitter Page");
			// Facebook Icon
			driver.get(url);
			FacebookIcon FacebookIcon = new FacebookIcon(driver);
			FacebookIcon.enterUserName();
			FacebookIcon.enterpassword();
			FacebookIcon.clickonlogin();
			FacebookIcon.FacebookIcon();
			System.out.println("Successfully launched Facebook Page");
			// Linkedin Icon
			driver.get(url);
			LinkedinIcon LinkedinIcon = new LinkedinIcon(driver);
			LinkedinIcon.enterUserName();
			LinkedinIcon.enterpassword();
			LinkedinIcon.clickonlogin();
			LinkedinIcon.LinkedinIcon();
			System.out.println(driver.getCurrentUrl());
			System.out.println("Successfully launched Linkedin Page");
			// Verify Add To Cart Page
			driver.get(url);
			VerifyAddToCartPage VerifyAddToCartPage = new VerifyAddToCartPage(driver);
			VerifyAddToCartPage.enterUserName();
			VerifyAddToCartPage.enterpassword();
			VerifyAddToCartPage.clickonlogin();
			VerifyAddToCartPage.AddToCart();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			VerifyAddToCartPage.CartLink();
			System.out.println("The Add To Cart has:");
			VerifyAddToCartPage.VerifyAddToCartPage();

			// DATA DRIVER FRAMEWORK
			driver.get(url);
			DataDriverFrameWork DataDriverFrameWork = new DataDriverFrameWork(driver);
			DataDriverFrameWork.main(url);
			String UN = "standard_user";
			DataDriverFrameWork.main(UN);
			String PW = "secret_sauce";
			DataDriverFrameWork.main(PW);
			driver.findElement(By.id("login-button"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
