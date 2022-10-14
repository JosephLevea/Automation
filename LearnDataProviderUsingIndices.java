package com.testNG.basic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.DataUtils;
import Utils.DataUtils2;

public class LearnDataProviderUsingIndices {

	//https://github.com/ortoniKC/selenium-tamil-youtube/blob/master/src/test/java/testNgBasic/LearnDataProvider.java
	
	@Test(dataProvider = "logintestdata", dataProviderClass = DataUtils.class)
	public void login(String data[]) throws InterruptedException {
		//		System.err.println("from parameters: "+id);
		System.err.println("Email: "+data[0]);
		System.err.println("Pass: "+data[1]);
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys(data[0]);
		driver.findElement(By.name("password")).sendKeys(data[1]);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='LOGIN']")).click(); 
		String title =
				driver.getTitle();
		System.out.println("Title is "+title); 
		driver.quit();

	}	}

/*  */