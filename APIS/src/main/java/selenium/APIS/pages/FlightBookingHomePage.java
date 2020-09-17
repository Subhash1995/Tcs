package selenium.APIS.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import selenium.APIS.base.TestBase;

 public class FlightBookingHomePage extends TestBase {
	 
    @FindBy(xpath = "//h1[text() = 'Welcome to the Simple Travel Agency!']")
	WebElement Homepagetitle;
	
    @FindBy(xpath = "//select[@class= 'form-inline' and @name ='fromPort']")
  	WebElement departurecitydrpdown;
    
    
    
    @FindBy(xpath = "//select[@class= 'form-inline' and @name ='toPort']")
  	WebElement destinationcitydrpdown;

  
    @FindBy(xpath = "//input[@type='submit']")
  	WebElement findflightsbtn;
    
    
    public FlightBookingHomePage() {
		PageFactory.initElements(driver, this);
	}
    
    
    public String verifyHomePageTitle(){
    	
    String s =	Homepagetitle.getText();
   // System.out.println(s);
		return s;
	}
    
    public void Selectdeparturecity(String depcity){
    	Select select = new Select(departurecitydrpdown);
    	select.selectByVisibleText(depcity);
	}
    
    public void Selectdestinationcity(String destcity){
    	Select select = new Select(destinationcitydrpdown);
    	select.selectByVisibleText(destcity);
    	
	}
    
    
    public void ClickonFindFlights(){
    	
    	findflightsbtn.click();
		
	}
    
  
 }