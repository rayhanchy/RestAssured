package apiTest;

import org.testng.annotations.Test;

import APIUtils.APIMethods;
import APIUtils.ApiUrls;

import org.testng.annotations.BeforeClass;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.Assert;

import org.testng.annotations.AfterClass;


public class PostTest {
	
	public APIMethods apimethod;
	public JSONObject requestBody;
	
	
	
  
  @BeforeClass
  public void beforeClass() {
	  
	   apimethod = new APIMethods();
	  
  }
  
  @Test
  public void CreateNewRecord() {
	  requestBody = new JSONObject(); 
	  
	  requestBody.put("name", "Rayhan");
	  requestBody.put("salary", "5000");
	  requestBody.put("age", "18");
	  
	 // Assert.assertTrue(apimethod.post_api(ApiUrls.createnewrecord, 200, requestBody), "Expected statuscode to be 200");
  Assert.assertTrue(apimethod.put_api(ApiUrls.createnewrecord, 201, requestBody), "Expected statuscode to be 201");
	 
  
  
  
}
  
  
  
 @Test
  public void CreateUser() {
	  
	 requestBody = new JSONObject();
	  
	  requestBody.put("name", "morpheus");
	  requestBody.put("job", "leader");
	  
	 Assert.assertTrue(apimethod.post_api(ApiUrls.createusers, 201, requestBody), "Expected statuscode to be 201");
	 
  }
  
  
 // @Test
  public void LogInSuccess() {
	  requestBody = new JSONObject();
	  
	  requestBody.put("email", "eve.holt@reqres.in");
	  requestBody.put("password", "cityslicka");
	  
	  Assert.assertTrue(apimethod.post_api(ApiUrls.loginsucceesful, 200, requestBody), "Expected statuscode to be 200");
	  
	    
  }
  
  @AfterClass
  public void afterClass() {
	  apimethod = null;
	  
  }
  
  }
