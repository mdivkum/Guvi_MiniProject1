package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import util.Utility;

public class TestBase extends Utility {
	
	@BeforeMethod
	public void launchbrowser() {
		launch();
	}
	

@AfterMethod
	public void closingbrowser() {
		closing();
	}
	
}
