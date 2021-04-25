package com.selenium.seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumWeekEnd\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com"); //Open URL
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.click();
		searchbox.clear();
		searchbox.sendKeys("Amazon");
		
		
		
		
	/*	WebElement amazonSearchbox = driver.findElement(By.id("twotabsearchtextbox"));
		driver.findElement(By.className(" "));
		driver.findElement(By.linkText("Gmail"));
		driver.findElement(By.partialLinkText("Gma"));
		driver.findElement(By.tagName("input"));*/

	}

}
