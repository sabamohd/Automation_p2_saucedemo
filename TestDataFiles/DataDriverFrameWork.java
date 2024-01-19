package TestDataFiles;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DataDriverFrameWork {
	
	static WebDriver driver;
	
	public  DataDriverFrameWork(WebDriver d) {
		driver = d;
	}

	
	public static void main(String args) {
		try {
			 DataDriverFrameWork instance = new DataDriverFrameWork(driver);
			String UrL = "https://www.saucedemo.com/";
			WebDriver driver;
			driver = new ChromeDriver();
			driver.get(UrL);
			driver.manage().window().maximize();
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\hp\\eclipse-workspace\\Assignment1_1\\src\\test\\java\\Selenium_Project_2_SauceDemo\\FileInputStream");
			Properties p = new Properties();
			p.load(fis);
			System.out.println(p.getProperty("url"));
			String url = p.getProperty("UrL");
			String UN = p.getProperty("UserName");
			String PW = p.getProperty("PassWord");
			driver.get(UrL);
			WebElement UserName = driver.findElement(By.id("user-name"));
			WebElement PassWord = driver.findElement(By.id("password"));
			WebElement LoginButton = driver.findElement(By.id("login-button"));
			
			
			

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
