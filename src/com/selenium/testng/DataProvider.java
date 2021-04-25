package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
	
	
	
	@Test(dataProvider="getdata")
	public void dataproviders(String username,String password)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumWeekEnd\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/SignIn.html"); //Open URL
		
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		
		
	}
	
	@org.testng.annotations.DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[4][2];
		
		data[0][0] = "merlin";
		data[0][1] = "pass1";
	
		
		data[1][0] = "sakthi";
		data[1][1] = "pass2";
		
		data[2][0] = "krithika";
		data[2][1] = "pass3";
		
		data[3][0] = "test";
		data[3][1] = "pass4";
 		
		
		return data;
		
	}
	
	

}
