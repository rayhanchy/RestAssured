package restAssured2;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Restassuredd {

	@Test
	public void TC001_getrequest() {
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.statusCode());
		System.out.println(response.getContentType());
		System.out.println(response.getHeaders());
		System.out.println(response.getTime());
		
		Assert.assertEquals(response.statusCode(), 200);
	}

	@Test
	public void TC002_singleuser() {
		
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getContentType());
		System.out.println(response.getHeaders());
		System.out.println(response.getTime());
		
		Assert.assertEquals(response.getStatusCode(), 200);
	
	}
	
	
	
}

	

