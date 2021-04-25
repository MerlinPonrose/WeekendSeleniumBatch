package com.selenium.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumWeekEnd\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html"); //Open URL\
		
		int framecount = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Frame count ="+framecount);
		WebElement iframe = driver.findElement(By.name("SingleFrame"));
		
	//driver.switchTo().frame("singleframe");  
	//	driver.switchTo().frame(0);
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("merlin");	
		
	//	driver.switchTo().frame()

	}

}
