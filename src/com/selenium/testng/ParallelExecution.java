package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution {

	@Test
	public void launchgoogle()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumWeekEnd\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com"); //Open URL
	}

	@Test
	public void launchAmzon()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumWeekEnd\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/"); //Open URL
	}

	@Test
	public void launchtestsite()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumWeekEnd\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html"); //Open URL
		WebElement MovieCheckbox = driver.findElement(By.id("checkbox2"));
		
		if(MovieCheckbox.isDisplayed())
		{
			System.out.println("checkbox is available");
		}
		else
		{
			System.out.println("checkbox is not available");
		}
		MovieCheckbox.click();
		
		 
		if(MovieCheckbox.isSelected())
		{
			MovieCheckbox.click();
		}
		else
		{
			System.out.println("already unchecked");
		}
	}
	
}
