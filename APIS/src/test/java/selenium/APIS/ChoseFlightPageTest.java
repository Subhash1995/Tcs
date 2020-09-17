
package selenium.APIS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.APIS.pages.ChoseFlightPage;
import selenium.APIS.base.TestBase;

public class ChoseFlightPageTest extends TestBase{

	ChoseFlightPage chooseflight ;
	
	@BeforeClass
	public void ChoseFlightPageTest1(){
			//super();
			chooseflight = new ChoseFlightPage();
			
	}
	


	@Test(priority=1)
	public void ClickonChooseThisFlightbtn() throws InterruptedException{
	
	
		chooseflight.ClickonChooseThisFlightbtn();
	}
	
	
	
}
