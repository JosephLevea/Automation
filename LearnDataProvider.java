package com.testNG.basic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider {

	//https://github.com/ortoniKC/selenium-tamil-youtube/blob/master/src/test/java/testNgBasic/LearnDataProvider.java
	
	@Test(dataProvider = "logintestdata")
	public void login(String email,String pass) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		System.err.println("Email: "+email);
		System.err.println("Pass: "+pass);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='LOGIN']")).click(); 
		System.out.println("Logged in successfully");

		String title =
				driver.getTitle();
		System.out.println("Title is "+title); 
		driver.quit();

	}
	
	
	  @DataProvider(name="logintestdata") 
	  public String[][] getLoginData() {
	  
	  String[][] data = new String[2][2]; 
	  data[0][0]="koushik350@gmail.com";
	  data[0][1]="Pass123$";
	  
	  data[1][0]="koushik1@letcode.in"; 
	  data[1][1]="Pass123$";
	  
	  return data ; 
	  }
	 
	
	

}