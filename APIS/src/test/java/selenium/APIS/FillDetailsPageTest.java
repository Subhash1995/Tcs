package selenium.APIS;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.APIS.pages.FillDetailsPage;
import selenium.APIS.base.TestBase;

public class FillDetailsPageTest extends TestBase {

	FillDetailsPage filldetails ;
	@BeforeClass
	public void FillDetailsPageTest1() {
		
		filldetails = new FillDetailsPage();
		
	}
	

	@Test(priority=1)
	public void fillDetailsOfCustomer(){
		
		
		filldetails.filltheDetails("subhash", "Amaravathi guntur district AndhraPradesh");	
	}
	
	@Test(priority=2)
	public void navigateToCnfPage() {
		
		filldetails.clickOnPurchaseFlightBtn();

	}
	
	
}
