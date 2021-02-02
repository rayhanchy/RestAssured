package APIUtils;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.openqa.selenium.support.ui.ExpectedCondition;

import io.restassured.http.ContentType;

public class APIMethods {
	
	public boolean Get_api(String url, int expectedStatusCode) {
		
		int actualStatusCode = given().when().get(url).getStatusCode();
		
		if(actualStatusCode == expectedStatusCode) {
			
			return true;
		}
		
		 return false;
		
	}

	public boolean Delete_api(String url, int expectedStatusCode) {
		
		int actualStatusCode =  given().when().get(url).getStatusCode();
		
		if(actualStatusCode == expectedStatusCode) {
			
			return true;
		}
		
		return false;
	}
	
	public boolean post_api(String url, int expectedStatusCode, JSONObject requestBody) {
		
		int actualStatusCode = given()
		.header("Content-Type ", "application/json")
		.accept(ContentType.JSON)
		.body(requestBody.toJSONString())
		.when()
		.post(url)
		.statusCode();
		
		if (actualStatusCode == expectedStatusCode) {
			return true;
			
		}
		return false;
		
	}
	
	public boolean put_api(String url, int expectedStatusCode, JSONObject requestBody) {
		
		int actualStatusCode = given()
				.header("Content-Type ", "application/json")
				.accept(ContentType.JSON)
				.body(requestBody.toJSONString())
				.when()
				.put(url)
				.getStatusCode();
				
				if (actualStatusCode == expectedStatusCode) {
					return true;
					
				}
				return false;
		
		
	}

	
	}

	
