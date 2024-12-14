package test;

import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;

public class SignUpPageTest extends TestBase{
	
	
	@Test
	public void signuptest() {
		
	HomePage obj= new HomePage(driver);
	obj.clicksignup().enterusername("Divyakumari").enterpassword("Test@123").signupbutton();
	obj.validateSignupbutton();
	
	
	}

}
