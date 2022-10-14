package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		// Instantiating objects and variables
		WebDriver driver = new ChromeDriver();

		// Using navigate to command navigate to another url		
		
		  driver.get("https://letcode.in/buttons"); 
		  
		 //To maximize the window
		  
		  driver.manage().window().maximize();
		 
		 // To get the current URL
		  
		  String url = driver.getCurrentUrl();
		  System.out.println("Button page URL "+ url);
		  Thread.sleep(3000); 
		  
		  driver.findElement(By.id("home")).click(); 
		  String homeURL = driver.getCurrentUrl(); 
		  System.out.println("Home page URL "+ homeURL);
		  Thread.sleep(3000); 
		  
		// Using Back command navigate to back page

		  
		  driver.navigate().back(); 
		  
		// Using Forward command navigate to forward page

		  driver.navigate().forward();
		  
		  System.out.println("retuns to button page "+driver.getCurrentUrl());
		 
	     // Using Refresh command Refresh current page
 
		  driver.navigate().refresh();
		  
		  driver.navigate().to("https://letcode.in/signin");

		  // To close the window
 		  driver.close();

	}
}

/*
 * 
 * Navigation nav = driver.navigate(); 
 * nav.back();
 *  nav.forward(); 
 *  nav.refresh();
 * nav.to("");
 */ 
