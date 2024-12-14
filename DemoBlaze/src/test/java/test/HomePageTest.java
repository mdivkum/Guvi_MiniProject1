package test;

import org.junit.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;

public class HomePageTest extends TestBase {
		
	@Test
	public void verifyhomepagetitle() throws InterruptedException {
		HomePage obj=new HomePage(driver);
		obj.clicklogin().LoginDetails("Divyakumari", "Test@123");
		String Title = obj.verifyhomepagetitle();
		System.out.println("Title of HomePage is  "+Title);
		Assert.assertEquals(Title, "STORE");
		obj.verifyusername();
		
	}


}
