package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertCommands {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
				
				//To launch the chrome driver
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://omayo.blogspot.com/");
				
				//To click the alert button
												
				driver.findElement(By.id("alert1")).click();
				
				//Without handling the alert ur tring to print the current URL so you will be ended up with UnhandledAlertException
				
			    // System.out.println(driver.getCurrentUrl());
				
				//To move to the alert popup
								
				Alert alert = driver.switchTo().alert();
				
				//To get the text from alert
				  
				String String1 = alert.getText();
				
				System.out.println(String1);
				
				//To click Ok
				  
				alert.accept();
				
				// To click Cancel
				 	            
	            alert.dismiss();
	            
	            
				driver.findElement(By.id("prompt")).click(); 
				Alert alert1 = driver.switchTo().alert();
				  
				alert1.sendKeys("Kannathasan"); alert.accept();
				 	
	             	             
	            

	       
	       }

	}


