package com.selenium.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumWeekEnd\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html"); //Open URL\
		
		Thread.sleep(10000);
		
		WebElement textBox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", textBox);
		
		Actions act = new Actions(driver);
		act.moveByOffset(20, 50);
		act.click();
		
		
		Thread.sleep(3000);
		WebElement promptbox = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		promptbox.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Merlin");
		alert.accept();
		
		driver.close();

	}

}
