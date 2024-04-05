package Selenium_WebDriver_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class S7__Hard_Assertion {

	@Test
	public void m1() {
		System.out.println("1");
		System.out.println("2");
		Assert.assertEquals(true, true);
		System.out.println("1");
		System.out.println("2");
	}
	
	@Test
	public void m2() {
		String act = "abcd";
		String exp = "abcd";
		Assert.assertEquals(act, exp);
		System.out.println("done");
	}

}
