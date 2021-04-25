package com.selenium.windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumWeekEnd\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html"); //Open URL\
		WebElement newwindow = driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']"));
		newwindow.click();
		WebElement clickbutton = driver.findElement(By.xpath("//button[text()='click']"));
		clickbutton.click();
		
		
		
		String parentwindow = driver.getWindowHandle();  // it wil return parent window 
		//System.out.println(parentwindow);
		
		Set<String> set = driver.getWindowHandles(); // it will return child window id
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			String childwindow = it.next();
			if(!parentwindow.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
				driver.findElement(By.xpath("//a[text()='Downloads']")).click();
			}
		}

		driver.switchTo().window(parentwindow);
	
		
		
	}

}
