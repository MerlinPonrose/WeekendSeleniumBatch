package com.selenium.seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\SeleniumWeekEnd\\exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html"); //Open URL
		
	WebElement FemaleRadioButton =	driver.findElement(By.xpath("//input[@value='FeMale']"));
	FemaleRadioButton.click();
	
	if(FemaleRadioButton.isSelected()) // isSelected - verify whether the button is selected or not
	{
		System.out.println("Button already selected");
	}
	else
	{
		FemaleRadioButton.click();
	}
	
	
	driver.close();

	}

}
