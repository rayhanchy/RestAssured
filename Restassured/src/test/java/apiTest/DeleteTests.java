package apiTest;

import org.testng.annotations.Test;

import APIUtils.APIMethods;
import APIUtils.ApiUrls;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class DeleteTests {
	
	public APIMethods apimeth; 
  
  @BeforeClass
  public void beforeClass() {
	  apimeth = new APIMethods();
	  
  }

  @Test
  public void Deleteemployee() {
	  
	Assert.assertTrue(apimeth.Delete_api(ApiUrls.Deleteemployee, 204), "Expected Status Code to be 204:ok");
	  
	  
  }
  
  @AfterClass
  public void afterClass() {
	  apimeth = null;
	  
	  
  }

}
