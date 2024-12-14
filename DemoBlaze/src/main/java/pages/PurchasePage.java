package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class PurchasePage extends TestBase {
	
	@FindBy(id = "name")
	WebElement name;
	
	@FindBy(id="country")
	WebElement country;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="card")
	WebElement creditcard;
	
	@FindBy(id="month")
	WebElement month;
	
	@FindBy(id = "year")
	WebElement year;
	
	@FindBy(xpath ="//button[contains(text(),'Purchase')]")
	WebElement purchase;
	
	@FindBy(xpath="//h2[contains(text(),'Thank you for your purchase!')]")
	WebElement success;
	
	@FindBy(xpath="//p[contains(@class,'lead text-muted')]")
	WebElement status;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement Ok;
	
	public PurchasePage() {
		PageFactory.initElements(driver, this);
	}
	
	public PurchasePage entername(String un) throws InterruptedException {
		Thread.sleep(1000);
		name.sendKeys(un);
		return this;
	}
	
	public PurchasePage entercountry(String coun) {
		country.sendKeys(coun);
		return this;
	}
	
	public PurchasePage entercity(String cit)
	{
	city.sendKeys(cit);
	return this;
	}
	
	public PurchasePage entercard(String x) {
		creditcard.sendKeys(x);
		return this;
	}
	
	public PurchasePage entermonth(String y) {
		month.sendKeys(y);
		return this;
	}

	public PurchasePage enteryear(String z) {
		year.sendKeys(z);
		return this;
	}
	
	public PurchasePage clickpurchase() throws InterruptedException {
		purchase.click();
		String OrderPlaced=success.getText();
		System.out.println("OrderPlaced Successfully :" +OrderPlaced);
		String OrderDetails=status.getText();
		System.out.println("Order details : " +OrderDetails);
		Ok.click();
		return this;
	}
	
}
