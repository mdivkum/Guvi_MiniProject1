package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SignUpPage extends TestBase{
	@FindBy ( id = "sign-username")
	WebElement username;
	
	@FindBy ( id = "sign-password")
	WebElement password;
	
	//@FindBy (className = "btn btn-primary")//use contains
	
	@FindBy (xpath ="//button[contains(text(),'Sign up')]")
	WebElement signupbutton;
	
	public SignUpPage() {
	PageFactory.initElements(driver, this);
	}
	

   public SignUpPage enterusername(String uname) {
	
	elementClickWait(username, 10);
    username.sendKeys(uname);
	return this;
	
}
	
public SignUpPage enterpassword(String pwd) {
	
	
	elementClickWait(password, 10);
	password.sendKeys(pwd);
	return this;
}
	
public SignUpPage signupbutton()
{
	
	elementClickWait(signupbutton, 20);
    signupbutton.click();
    return this;
    
}

}
