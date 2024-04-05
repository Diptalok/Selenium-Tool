package Selenium_WebDriver_TestNG;

import org.testng.annotations.Test;

@Test
public class S3__TestNG_Methods {
	/*@Test(priority=-1)
	//priority
	public void CreateContact()
	{
		System.out.println("contact created");
	}
	
	@Test(priority=5)
	public void ModifyContact()
	{
		System.out.println("contact mofidied");
	}
	
	@Test(priority=3)
	public void DeleteContact()
	{
		System.out.println("contact deleted");
	}
	
	//dependsOnMethods
	@Test
	public void CreateContact()
	{
		sSystem.out.println("contact created");
	}
	
	@Test(dependsOnMethods = "CreateContact")
	public void ModifyContact()
	{
		System.out.println("contact mofidied");
	}
	
	@Test(dependsOnMethods = "CreateContact")
	public void DeleteContact()
	{
		System.out.println("contact deleted");
	}*/
	
	//enabled
	@Test(enabled = false)
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
	
	/*@Test(invocationCount = 3)
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
	}*/
	
}
