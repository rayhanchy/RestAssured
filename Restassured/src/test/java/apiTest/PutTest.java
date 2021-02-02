package apiTest;

import org.testng.annotations.Test;

import APIUtils.APIMethods;
import APIUtils.ApiUrls;

import org.testng.annotations.BeforeClass;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PutTest {
	
	public APIMethods apimethod;
	public  JSONObject requestBody;
	
	
	
	@BeforeClass
	  public void beforeClass() {
		  
		  apimethod = new APIMethods();
	
	    
  }
	@Test
	  public void RecordUPdate() {
		  
		  requestBody = new JSONObject();
		  
		  requestBody.put("name", "morpheus");
		  requestBody.put("job", "zion resident");
		  
		  Assert.assertTrue(apimethod.put_api(ApiUrls.updaterecord, 200, requestBody), "Expected code to be 200");
	  
  }
	@Test
	public void UpdateData() {
		
		requestBody = new JSONObject();
		
		requestBody.put("name", "Rayhan");
		requestBody.put("salary", "23000");
		requestBody.put("age", "23");
		
		Assert.assertTrue(apimethod.put_api(ApiUrls.updatedata, 200, requestBody), "Expected code to be 200");
		
		
	}	
	  @AfterClass
  public void afterClass() {
	  apimethod = null;
	  
  }

}
