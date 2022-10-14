package com.selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

        //Creating instance of Chrome driver
        WebDriver driver = new ChromeDriver();
        
         
         
 		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		  driver.get("http://omayo.blogspot.com/"); 
          
 		  driver.manage().window().maximize();

 		  String windowHandle = driver.getWindowHandle(); 
 		  
 		  System.out.println("first Window: "+windowHandle);
 		  
		  driver.findElement(By.linkText("Open a popup window")).click();
 		  
			  Thread.sleep(3000);
			  
			  Set<String> windows = driver.getWindowHandles();
			  
			  Iterator<String> itr = windows.iterator();
			  
			  while(itr.hasNext()) {
			  
			  String window = itr.next();
			  
			  driver.switchTo().window(window);
			  
			  if(driver.getTitle().equals("Basic Web Page Title")) {
			  
			  System.out.println("EQUALS PAGE"); 
			  
			  driver.close(); 
			  
			  }
			  
			  }
			  
			  
			  Thread.sleep(3000);
			  
			  driver.switchTo().window(windowHandle);
			  
			  Thread.sleep(7000);
			  
			  driver.findElement(By.id("ta1")).sendKeys("Kannathasansdet");
			  
			 
			  driver.close();
			  

 }
}


		
