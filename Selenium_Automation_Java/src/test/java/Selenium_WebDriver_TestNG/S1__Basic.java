package Selenium_WebDriver_TestNG;

import org.testng.annotations.Test;

public class S1__Basic {
	
	@Test
	public void CreateContact()
	{
		System.out.println("contact created");
	}
	
	@Test
	public void ModifyContact()
	{
		System.out.println("contact mofidied");
	}
	
	
	@Test
	public void DeleteContact()
	{
		System.out.println("contact deleted");
	}

}
