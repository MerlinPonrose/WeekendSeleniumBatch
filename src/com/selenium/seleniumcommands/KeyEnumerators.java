package com.selenium.seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyEnumerators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumWeekEnd\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html"); //Open URL
		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.click();
		firstName.clear();
		firstName.sendKeys("Merlin");
		
		
		//firstName.sendKeys(Keys.TAB);
		
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		firstName.sendKeys(Keys.TAB);
		WebElement LastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		LastName.sendKeys(Keys.chord(Keys.CONTROL,"v"));

	}

}
