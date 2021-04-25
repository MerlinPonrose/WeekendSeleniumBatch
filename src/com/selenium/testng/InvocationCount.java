package com.selenium.testng;

import org.testng.annotations.Test;

public class InvocationCount {
	
	
	@Test(invocationCount =3,groups= {"smoke"})
	public void display()
	{
		System.out.println("merlin");
	}
	

}
