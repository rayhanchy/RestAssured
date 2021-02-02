package apiTest;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import APIUtils.APIMethods;
import APIUtils.ApiUrls;

public class GetTest {
	
	public APIMethods apimeth;
	
	
	@BeforeClass
	public void beforeclass() {
		apimeth = new APIMethods();
		
	}
	
	@Test
	
	public void Getallemployees() {
	
	
	Assert.assertTrue(apimeth.Get_api(ApiUrls.getallemployees, 200), "Expected Status Code to be 200:ok");
	
}
	
	@Test
	public void getemployee1() {
				
		Assert.assertTrue(apimeth.Get_api(ApiUrls.getemployee1, 200), "Expected Status Code to be 200:ok");
		
	}
	
	@Test
	public void listofusers() {
		
		Assert.assertTrue(apimeth.Get_api(ApiUrls.listofusers, 200), "Expected Status Code to be 200:ok");
		
	}
	
	
	@AfterClass
	public void afterclas() {
		apimeth = null;
		
	}

}
