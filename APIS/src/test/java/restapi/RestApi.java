package restapi;

import java.util.ArrayList;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import selenium.APIS.base.TestBase;
public class RestApi extends TestBase
	{
	
	@Test
	public void statusCodeValidation() {
		
	
	RequestSpecification request = RestAssured.given();
	
	request.baseUri(TestBase.prop.getProperty("baseurl"));
	
	Response response = request.get( "v4/launches/latest");
	
	int stat =response.getStatusCode();
	
	Assert.assertEquals(200, stat);
}
	
	@Test
	public void apiIdValidation()
	{
		
	RequestSpecification request = RestAssured.given();
	
	request.baseUri(TestBase.prop.getProperty("baseurl"));
	

	Response response = request.get("v4/launches/latest");
	
      JsonPath resp = response.jsonPath();
      
      // can be converted to pojo class and get the attribute and assert it 
      //but due to time constraint making use of java collections
    String map = resp.get("id");
	
    System.out.println(map);
	Assert.assertTrue(map!=null);
		
	}

	
	@Test
	public void verifyCores()
	{
		
	RequestSpecification request = RestAssured.given();
	
	request.baseUri(TestBase.prop.getProperty("baseurl"));
	

	Response response = request.get("v4/launches/latest");
	
      JsonPath resp = response.jsonPath();
      
   ArrayList<Map<String,String>> map = resp.get("cores");
	
  Map<String, String> k = map.get(0);

Assert.assertTrue(k.get("core")!=null);
		
	}
	
	@Test
	public void verifyLaunchPad()
	{
		
	RequestSpecification request = RestAssured.given();
	
	request.baseUri(TestBase.prop.getProperty("baseurl"));
	

	Response response = request.get("v4/launches/latest");
	
      JsonPath resp = response.jsonPath();
      
   String map = resp.get("launchpad");

Assert.assertTrue(map!=null);
		
	}
	
	
	@Test
	public void verifypayLoads()
	{
		
	RequestSpecification request = RestAssured.given();
	
	request.baseUri(TestBase.prop.getProperty("baseurl"));
	

	Response response = request.get("v4/launches/latest");
	
      JsonPath resp = response.jsonPath();
      
   ArrayList<String> map = resp.get("payloads");

   System.out.println(map);
Assert.assertTrue(map!=null);
		
	}
	
	}
