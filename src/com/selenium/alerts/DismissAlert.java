package com.selenium.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DismissAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumWeekEnd\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html"); //Open URL\
		WebElement AlertokAndCancelButton = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		AlertokAndCancelButton.click();
		WebElement confirmbox = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"))	;
		confirmbox.click();
		
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		
		WebElement textarea = driver.findElement(By.xpath("//p[@id='demo']"));
		String value = textarea.getText(); // getText - for retrieving text from wed page
		String attribute = textarea.getAttribute("id"); // getAttribute - for retrieving value of any attribute
		System.out.println("value in attribute="+attribute);
		System.out.println(value);
		
		if(value.contains("Cancel"))
		{
			System.out.println("alert is cancelled");
		}
		else
		{
			System.out.println("alert is not cancelled");
		}
	}

}
