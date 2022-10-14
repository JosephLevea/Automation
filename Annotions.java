package com.testNG.basic;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Annotions {

WebDriver driver;

@BeforeClass
public void testSetup()
{
System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();

}

@BeforeMethod
public void openBrowser()
{
driver.get("https://www.browserstack.com/");
driver.findElement(By.id("signupModalButton")).click();
System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
}

@Test(description="This method validates the sign up functionality")
public void signUp()
{
driver.findElement(By.id("user_full_name")).sendKeys("Kannathasan");
driver.findElement(By.id("user_email_login")).sendKeys("Kannathasansdet@gmail.com");
driver.findElement(By.id("user_password")).sendKeys("password");

JavascriptExecutor jse = (JavascriptExecutor) driver;

WebElement checkbox=	driver.findElement(By.xpath("//*[@id=\"tnc_checkbox\"]"));
jse.executeScript("arguments[0].click()",checkbox);

WebElement submitbutton=	driver.findElement(By.id("user_submit"));
jse.executeScript("arguments[0].click()",submitbutton);

System.out.println("Sign up button clicked successfully");

}

@AfterMethod
public void postSignUp()
{
System.out.println(driver.getCurrentUrl());

}

@AfterClass
public void afterClass()
{
driver.quit();
}

}