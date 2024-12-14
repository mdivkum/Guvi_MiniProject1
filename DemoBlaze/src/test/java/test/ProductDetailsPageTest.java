package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductDetailsPage;


public class ProductDetailsPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	ProductDetailsPage productdetailpage;
	
	@BeforeMethod
	public void setup() throws Throwable {
		HomePage obj= new HomePage(driver);
		obj.clicklogin().LoginDetails("Divyakumari", "Test@123");
		obj.searchcategories();
}
	@Test(priority=1)
	public void ProductInfo() throws Throwable {
	ProductDetailsPage obj = new ProductDetailsPage();
	HomePage obj2= new HomePage(driver);
	obj.clicktheproduct().nameofproduct().validateProdPrice();
    obj.ProdDescription().clickaddtocart().clickHome();
    obj2.searchphone();
    obj.selectphone();
    obj.clickphonetocart();
    obj2.clickcart();
   
    
		}
	
	
	
	
	
	
}
