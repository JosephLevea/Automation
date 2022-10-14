package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
                       
        // Maximize the window
        driver.manage().window().maximize();
        
		// open webpage
		driver.get("https://chercher.tech/practice/frames");
		
		  // store the text value 
		  
		  String textValue =driver.findElement(By.xpath("//label/span")).getText();
		  
		  System.out.println(textValue);
		  
		  // switch to frame1
		  
		  driver.switchTo().frame("frame1");
		  
		  // set the value of the textbar to the value stored
		  
		  Thread.sleep(9000);
		  
		  driver.findElement(By.xpath("//body//input")).sendKeys(textValue);
		 
		
	
				driver.close();
		
	}

}


// Sceanrio 2

/*
		//find the frame1 and store it in webelement
		
		WebElement frame1 = driver.findElement(By.id("frame1"));
		
		// switch to frame1
		driver.switchTo().frame(frame1);
		
		// find the frame 3
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		
		// switch to frame 3
		driver.switchTo().frame(frame3);
		
		// find the checkbox
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		// if checkbox is not selected then click the checkbox
		
		if(! checkbox.isSelected()){
			checkbox.click();
						System.out.println("The Checkbox is clicked successfully");

		}
		
	// Sceanrio 3

		
		driver.get("https://chercher.tech/practice/frames");
		
		//find the frame1 and store it in webelement
		WebElement frame1 = driver.findElement(By.id("frame1"));
		// switch to frame1
		driver.switchTo().frame(frame1);
		// find the frame 3
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		// switch to frame 3
		driver.switchTo().frame(frame3);
		// find the checkbox
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		// if checkbox is not selected then click the checkbox
		if(! checkbox.isSelected()){
			checkbox.click();
		}
		// navigate to parent frame, which is frame 1
		driver.switchTo().parentFrame();
		// set the value of the textbar to the value stored
		driver.findElement(By.xpath("//body//input")).sendKeys("selenium");
		// navigate to parent, which is page
		driver.switchTo().parentFrame();
		// store the text value
		String textValue = driver.findElement(By.xpath("//label/span")).getText();
		//verify the value matches or not
		if(textValue.equals("selenium webdriver")){
			System.out.println("Topic value is equal to 'selenium webdriver'");
		 else {
					System.out.println("Topic value is not equal to 'selenium webdriver'");

				}

				driver.close();
				
				
				
				
				
		Sceanrio 3		
				
				// open webpage
		driver.get("https://chercher.tech/practice/frames");
		//find the frame1 and store it in webelement
		WebElement frame1 = driver.findElement(By.id("frame1"));
		// switch to frame1
		driver.switchTo().frame(frame1);
		// find the frame 3
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		// switch to frame 3
		driver.switchTo().frame(frame3);
		// find the checkbox
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		// if checkbox is not selected then click the checkbox
		if(! checkbox.isSelected()){
			checkbox.click();
		}
		// navigate to page level
		driver.switchTo().defaultContent();
		//switch to frame2
		driver.switchTo().frame("frame2");
		//find the dropdown
		WebElement dropdown = driver.findElement(By.tagName("select"));
		//Create object for select class
		Select sel = new Select(dropdown);
		//select the 'avatar' option
		sel.selectByVisibleText("Avatar");
	}
	
	
	Scenario 4
	
	// open webpage
		driver.get("https://chercher.tech/practice/frames");
		//find the frame1 and store it in webelement
		WebElement frame1 = driver.findElement(By.id("frame1"));
		// switch to frame1
		driver.switchTo().frame(frame1);
		// find the frame 3
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		// switch to frame 3
		driver.switchTo().frame(frame3);
		// find the checkbox
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		// if checkbox is not selected then click the checkbox
		if(! checkbox.isSelected()){
			checkbox.click();
		}
		// navigate to parent frame, which is frame 1
		driver.switchTo().parentFrame();
		// set the value of the textbar to the value stored
		driver.findElement(By.xpath("//body//input")).sendKeys("selenium");
		// navigate to parent, which is page
		driver.switchTo().parentFrame();
		// store the text value
		String textValue = driver.findElement(By.xpath("//label/span")).getText();
		if(textValue.equals("selenium webdriver")){
			System.out.println("Topic value is equal to 'selenium webdriver'");
		}
		//switch to frame2
		driver.switchTo().frame("frame2");
		//find the dropdown
		WebElement dropdown = driver.findElement(By.tagName("select"));
		//Create object for select class
		Select sel = new Select(dropdown);
		//select the 'avatar' option
		sel.selectByVisibleText("Avatar");
	}
}
*/		
