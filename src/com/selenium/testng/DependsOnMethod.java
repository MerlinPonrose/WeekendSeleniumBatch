package com.selenium.testng;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	

	@Test(dependsOnMethods= {"cycle","bike"})
	public void car()
	{
		System.out.println("car");
	}
	
	@Test(enabled=true)
	public void bike()
	{
		System.out.println("bike");
	}
	@Test
	public void cycle()
	{
		System.out.println("cycle");
	}


}
