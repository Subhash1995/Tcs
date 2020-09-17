package selenium.APIS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import selenium.APIS.pages.FlightBookingHomePage;
import selenium.APIS.base.TestBase;

public class FlightBookingHomePageTest extends TestBase {
	
public	static FlightBookingHomePage FlightBook ;
	
	
	@BeforeTest
	public void FlightBookingHomePageTest1() {
		
		initialization() ;

		FlightBook = new FlightBookingHomePage();
		 
	}
	
	@BeforeMethod
	public void  setup(){
	
	}
	
	@Test(priority=1)
	public void verifyHomePageTitle(){
		String f =FlightBook.verifyHomePageTitle() ;
		Assert.assertEquals(f,"Welcome to the Simple Travel Agency!" );
	}
	
	@Test(priority=2)
	public void selectDepartureandDestinationcity() throws InterruptedException{
		
//	Wait wait = new FluentWait<WebDriver>(TestBase.driver)
//			.withTimeout(50, TimeUnit.SECONDS)
//			.pollingEvery(3, TimeUnit.SECONDS)
//			.ignoring(NoSuchElementException.class);
	
		System.out.println(driver.getPageSource());
	    FlightBook.Selectdeparturecity("Boston");
		FlightBook.Selectdestinationcity("London");
	
	}
	
	@Test(priority =3)
	public void click() throws InterruptedException{
	
		FlightBook.ClickonFindFlights();
		
	}

}
