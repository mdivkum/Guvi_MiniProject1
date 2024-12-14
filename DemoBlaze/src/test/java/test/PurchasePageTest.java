package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductDetailsPage;
import pages.PurchasePage;

public class PurchasePageTest extends TestBase{
	
	HomePage homepage;
	ProductDetailsPage productdetailspage;
	LoginPage loginpage;
	CartPage cartpage;
	
	@BeforeMethod
	public void setup() throws Throwable {
		
	 homepage = new HomePage(driver);	
	 loginpage = new LoginPage();
	 productdetailspage = new ProductDetailsPage();
	 cartpage = new CartPage();
	 homepage.clicklogin();
	 homepage = loginpage.LoginDetails("Divyakumari", "Test@123");
	 HomePage obj=new HomePage(driver);
	 obj.searchcategories();
	 productdetailspage.clicktheproduct().nameofproduct().ProdDescription().clickaddtocart().clickHome();
	 obj.searchphone();
	 productdetailspage.selectphone();
	 productdetailspage.clickphonetocart();
	 obj.clickcart();
	 }

	@Test(priority=1)
	public void deleteitems() throws InterruptedException {
		cartpage.deleteiphone().placetheorder();
		PurchasePage obj=new PurchasePage();
		HomePage obj2=new HomePage(driver);
		obj.entername("Divya").entercountry("India").entercity("Chennai").entercard("ABCDEF").entermonth("November").enteryear("2025");
		obj.clickpurchase();
	    obj2.clicklogout();
		
	}
	

}
