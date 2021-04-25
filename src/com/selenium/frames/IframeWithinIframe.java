package com.selenium.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeWithinIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumWeekEnd\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html"); //Open URL\
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
	
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
		
		int framecount = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Frame count ="+framecount);
		
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("merlin");
		
	//	driver.switchTo().defaultContent(); // move out of frame
		
		driver.switchTo().parentFrame();
		
		
		
		driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
		

	}

}
