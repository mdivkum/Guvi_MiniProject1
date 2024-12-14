package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;

public class ProductDetailsPage extends TestBase{
	
	HomePage homepage;
	
	@FindBy (xpath = "(//img[@class='card-img-top img-fluid'])[3]")
	WebElement macbook;
	
	@FindBy (className = "name")
	WebElement productname;
	
	@FindBy(xpath = "//h3[@class='price-container']")
	WebElement price;
	
	@FindBy(xpath = "//strong[contains(text(),'Product description')]")
	WebElement description;
	
	@FindBy(xpath = "//a[contains(@class,'btn btn-success btn-lg')]")
	WebElement addtocart;
	
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement home;
	
    @FindBy(xpath = "//img[contains(@src,'imgs/iphone_6.jpg')]")
    WebElement iphone;
    
    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    WebElement AddtoCart;
    
public ProductDetailsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public ProductDetailsPage clicktheproduct() throws InterruptedException {
		
		Thread.sleep(2000);
		macbook.click();
		return this;
	}
	
	public ProductDetailsPage nameofproduct() throws InterruptedException {
		Thread.sleep(2000);
		String NameOfTheProduct = productname.getText();
		System.out.println("Name of the product is " +NameOfTheProduct);
		Assert.assertEquals(NameOfTheProduct,"MacBook air");
		return this;
		
	}
	
	public boolean validateProdPrice() {
		return price.isDisplayed();
		
	}

	public ProductDetailsPage ProdDescription() {
		description.isDisplayed();
		System.out.println("Product Description is available on the product page ");
		description.getText();
		return this;
	}
	
	public ProductDetailsPage clickaddtocart() throws InterruptedException {
		
		addtocart.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return this;
		
	}
	
	public void clickHome() throws InterruptedException {
		Thread.sleep(2000);
		home.click();
	
	}
	
	public void selectphone() throws InterruptedException {
		Thread.sleep(2000);
		iphone.click();
	}
	
	public ProductDetailsPage clickphonetocart() throws Throwable {
		Thread.sleep(2000);
		AddtoCart.click();
		Thread.sleep(2000);
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		return this;
	}
		
	
}
