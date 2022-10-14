package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Implicit Wait is a Global Wait which waits for all the Web Elements equally
		
		//Unlike Thread.Sleep, Implicit Wait waits for the Web Elements dynamically 
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");

		
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 		
		//Here it wont work
		driver.findElement(By.className("dropbtn")).click();
		
		driver.findElement(By.linkText("Facebook")).click();
		
		System.out.println("From the dropdown Facebook is clicked");
		
		driver.close();
	

	}

}
