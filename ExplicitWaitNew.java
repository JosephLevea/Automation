package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitNew {

	//Instead of waiting for all the Web Elements in the automation script, Explicit wait will wait only for the specific web element
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		
		 WebDriverWait wait = new WebDriverWait(driver, 5);
		 
		 driver.get("http://www.omayo.blogspot.com");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.className("dropbtn")).click();
		 
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		 
		 element.click();	
		 
		 //ElementToBeClickable
		 
			/*
			 * driver.findElement(By.id("timerButton")).click();
			 
			 *		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));

element.click();
			 */
		
	}

}
