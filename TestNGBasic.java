package com.testNG.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGBasic {
  @Test
  public void LaunchURLTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		 
	     // Instantiating objects and variables
		 WebDriver driver = new ChromeDriver();
		 	 
	     // Using navigate to command navigate to another url
			driver.get("https://stqatools.com/");
			
		  //To Maximize the browser
			
			driver.manage().window().maximize();
			
			driver.close();
	  
  }
  @Test

  public void VerifyPageTitleTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		 
	     // Instantiating objects and variables
		 WebDriver driver = new ChromeDriver();

		driver.get("https://stqatools.com/");
		
		if (driver.getTitle().equals("SELENIUM WebDriver Tutorials with java for Automation Testing"))
		{
			System.out.println("Title is SELENIUM WebDriver Tutorials with java for Automation Testing ");
		}
		else
		{
			System.out.println("Title is not SELENIUM WebDriver Tutorials with java for Automation Testing");
		}
	
		System.out.println("The current URL" + driver.getCurrentUrl());
		
		driver.close();

	  
  }
}
