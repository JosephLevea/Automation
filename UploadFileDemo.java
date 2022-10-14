package com.selenium;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		// Instantiating objects and variables
			
		WebDriver driver = new ChromeDriver();

	    //To maximize browser
							
		driver.manage().window().maximize(); 
				  
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		WebElement uploadEle = driver.findElement(By.xpath("//input[@type='file']"));
		
		//To upload the files 
		
		uploadEle.sendKeys("D:\\Class_Note\\Selenium\\screenshots\\Selenium1661397283171.png");
		
		driver.findElement(By.xpath("//span[.='Start upload']")).click();
		
		Thread.sleep(4000);

		
		WebElement DeleteButton = driver.findElement(By.cssSelector("button[data-type='DELETE']"));
		
		boolean displayed = DeleteButton.isDisplayed();
		
		System.out.println("The delete button is displayed which is "+displayed);	
		
		Thread.sleep(4000);
		
		DeleteButton.click();
		
		driver.close();
		
		
	}

}
