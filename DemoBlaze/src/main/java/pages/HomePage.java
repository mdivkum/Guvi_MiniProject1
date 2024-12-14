package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
//Initialized webelement
	
	@FindBy (xpath = "//a[@id='signin2']")
	WebElement signup;
	
	@FindBy (id = "login2")
	WebElement login;
	
	@FindBy (id = "nameofuser")
	WebElement nameofuser;
	
	@FindBy(xpath = "//a[contains(text(),'Laptops')]")
	WebElement laptop;
	
	@FindBy(linkText = "Laptops")
	WebElement laptops;
	
	@FindBy(xpath = "//a[contains(text(),'Phones')]")
	WebElement phones;
	
	 @FindBy(linkText="Cart")
	 WebElement cart;
	 
	 @FindBy(id="logout2")
	 WebElement logout;
	
//Initializing page factory 
	
	 public HomePage(WebDriver driver) {
	
		 PageFactory.initElements(driver, this);
		 } 
	 
	 public String verifyhomepagetitle() {
		return driver.getTitle();
	 }
	 
	public boolean verifyusername() {
		 
	    elementClickWait(nameofuser, 10);
		String UsernameDetail= nameofuser.getText();
		System.out.println(UsernameDetail);
		return nameofuser.isDisplayed();
	 }
	 public HomePage validateSignupbutton() {
		 
		 signup.isDisplayed();
		 System.out.println("SignUp Button is visible in the Home Page");
		 System.out.println("Successfully Signed Up ");
		 return this;		 
	 }
	 
	 public HomePage validateloginbutton() {
		 login.isDisplayed();
		 login.isSelected();
		 System.out.println("Login Button is visible and selected in the HomePage");
		 System.out.println("Successfully Logged In ");
		 return this;
		 
	 }
	 
	 public SignUpPage clicksignup() {
		 signup.click();
	     return new SignUpPage();
		 
	 }
   public LoginPage clicklogin() {
		login.click();
		return new LoginPage();
		
	}
   
   public  ProductDetailsPage searchcategories() throws Throwable {
	  Thread.sleep(1000);
	//  elementClickWait(laptops,10);
	   laptops.click();
	   return new ProductDetailsPage();
	   
   }
   
   public ProductDetailsPage searchphone() throws InterruptedException {
	   Thread.sleep(2000);
	   phones.click();
	   return new ProductDetailsPage();
   }
	
   public CartPage clickcart() throws InterruptedException {
		Thread.sleep(2000);
		cart.click();
		return new CartPage();
	}
   
   public void clicklogout() throws InterruptedException {
	 Thread.sleep(3000);
	 logout.click();
	 System.out.println("Successfully Logged Out ");
   }
   
}






/*   Set<String> windowHandles = driver.getWindowHandles();
Iterator<String> iterator = windowHandles.iterator();
String parentWindow = iterator.next();
String childWindow = iterator.next(); 
driver.switchTo().window(childWindow);
driver.switchTo().window(parentWindow);


*/

/*	 
String mainwindow=driver.getWindowHandle();
Set<String> allwindow=driver.getWindowHandles();
	int num=allwindow.size();
	System.out.println(num);
Iterator<String> iterator=allwindow.iterator();
	while(iterator.hasNext()) {
		String childwindow=iterator.next();
		
		if(!mainwindow.equals(childwindow)) {
			driver.switchTo().window(childwindow);
			
		}
		
	}*/
