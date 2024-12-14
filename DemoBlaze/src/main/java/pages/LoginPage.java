package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
		
@FindBy (id = "loginusername")
WebElement username;

@FindBy ( id = "loginpassword")
WebElement password;

@FindBy (xpath = "//button[contains(text(),'Log in')]")
WebElement LogIn;



LoginPage loginpage;
HomePage homepage;

public LoginPage() {
	
	PageFactory.initElements(driver, this);
	
}

public HomePage LoginDetails(String un , String pwd) throws InterruptedException {
	
//	elementClickWait(username, 20);
	Thread.sleep(1000);
	username.sendKeys(un);
	password.sendKeys(pwd);
	LogIn.click();
	return homepage;
	
}

}
