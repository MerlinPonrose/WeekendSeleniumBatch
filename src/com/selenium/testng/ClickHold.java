package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClickHold {
	
public	WebDriver driver;
	
@BeforeSuite
	public void launchbrowser()
	{
	System.out.println("In before suite");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumWeekEnd\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@BeforeTest
	public void OpenURL()
	{
		System.out.println("In before Test");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/sortable"); //Open URL
		
	}
	
	@Test
	public void clickAndHold()
	{
		System.out.println("in test1");
		WebElement ListTwo = driver.findElement(By.xpath("(//div[text()='Two'])[1]"));
		WebElement ListSix = driver.findElement(By.xpath("(//div[text()='Six'])[1]"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(ListTwo);
		act.release(ListSix).build().perform();
		
	}
	
	@Test
	public void verifypagetitle()
	{
		System.out.println("In test2");
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("ToolsQA"))
		{
			System.out.println("same title");
		}
	}
	@Test
	public void display()
	{
		System.out.println("in test 3");
	}
	
	
	@AfterTest
	public void closebrowser()
	{
		System.out.println("In after test");
		driver.quit();
	}

}
