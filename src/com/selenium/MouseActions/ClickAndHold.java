package com.selenium.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumWeekEnd\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/sortable"); //Open URL
		
		WebElement ListTwo = driver.findElement(By.xpath("(//div[text()='Two'])[1]"));
		WebElement ListSix = driver.findElement(By.xpath("(//div[text()='Six'])[1]"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(ListTwo);
		act.release(ListSix).build().perform();
		
		

	}

}
