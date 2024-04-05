package Selenium_WebDriver_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class S8__Soft_Assertion {

	    @Test
		public void m1() {
			System.out.println("1");
			System.out.println("2");
			SoftAssert sft = new SoftAssert();
			//sft.assertEquals(true, true);
			sft.assertAll();
			System.out.println("1");
			System.out.println("2");
			sft.assertAll();
		}
		
		@Test
		public void m2() {
			String act = "abcd";
			String exp = "abcd";
			Assert.assertEquals(act, exp);
			System.out.println("3");
		}
}
