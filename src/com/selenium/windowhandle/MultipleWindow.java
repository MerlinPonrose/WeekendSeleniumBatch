package com.selenium.windowhandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumWeekEnd\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html"); //Open URL\
		WebElement multiplewindow = driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']"));
		multiplewindow.click();
		Thread.sleep(3000);
		WebElement clickbutton = driver.findElement(By.xpath("(//button[@class='btn btn-info'])[2]"));
		clickbutton.click();
		
		
		String parentwindow = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		
		ArrayList<String> array = new ArrayList<>(set);  //Have to convert set to arraylist
		
		driver.switchTo().window(array.get(2));
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("mrlnrose6@gmail.com");
		driver.switchTo().window(array.get(1));
		
		driver.switchTo().window(parentwindow);
		
	}

}
