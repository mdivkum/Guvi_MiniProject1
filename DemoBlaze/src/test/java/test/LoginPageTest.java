package test;

import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;

public class LoginPageTest extends TestBase{
	
	@Test
	public void loginpagetest() throws InterruptedException {
		
	HomePage obj= new HomePage(driver);
	obj.clicklogin().LoginDetails("Divyakumari", "Test@123");
	obj.verifyhomepagetitle();
	obj.validateloginbutton();
	
	}
	
}
