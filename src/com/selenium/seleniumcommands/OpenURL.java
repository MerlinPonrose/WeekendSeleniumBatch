package com.selenium.seleniumcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumWeekEnd\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com"); //Open URL
		String title =driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("Google"))
		{
			System.out.println("same title");
		}
		else
		{
			System.out.println("not same");
		}
		
		
		driver.close(); // closes only the current page
		//driver.quit(); // closes all the window opened by selenium instance
		

	}

}
