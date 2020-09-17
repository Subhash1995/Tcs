
  
package selenium.APIS;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.APIS.pages.PurchaseConfirmationPage;
import selenium.APIS.base.TestBase;

public class PurchaseConfirmationPageTest extends TestBase{
	PurchaseConfirmationPage confirmation;
	
	@BeforeMethod
	public void  PurchaseConfirmationPageTest1() {
		//super();
		confirmation = new PurchaseConfirmationPage();
	}
	
	
	@Test(priority=1)
public void purchaseIdVerification() {

		boolean d =confirmation.PurchaseIdConfirmation() != null;
		Assert.assertEquals(d, true);
		driver.quit();
}
}

