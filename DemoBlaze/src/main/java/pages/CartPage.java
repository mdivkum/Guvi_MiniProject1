package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CartPage extends TestBase{
	
	
	@FindBy(linkText= "Delete")
	WebElement delete;
	
	@FindBy(xpath="//button[contains(text(),'Place Order')]")
	WebElement placeorder;
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public CartPage deleteiphone() throws InterruptedException {
		Thread.sleep(2000);
		delete.click();
		return this;
		
	}
	
	public CartPage placetheorder() throws InterruptedException {
		
		Thread.sleep(2000);
		placeorder.click();
		return this;
	}

}
