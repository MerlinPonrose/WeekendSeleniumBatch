package com.selenium.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumWeekEnd\\exe\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/sortable"); //Open URL
			
			WebElement ListTwo = driver.findElement(By.xpath("(//div[text()='Two'])[1]"));
			ListTwo.click();
			
		}

		catch(Exception e)
		{
			
			TakesScreenshot screenshot = (TakesScreenshot)driver;
			File src =screenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumWeekEnd\\Screenshot\\TestScreenshot.jpeg"));
			
		}
	
	}

}
