package restAssurBDDpractice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Patchrequest {

	
	@Test
	public void putreq() {
		
		JSONObject requestbody = new JSONObject();
		requestbody.put("name","morpheus" );
		requestbody.put("job", "zion resident");
		
		//System.out.println(requestbody);
		
		given()
		.header("Content-Type", "application/json")
		.accept(ContentType.JSON)
		.body(requestbody.toJSONString())
		.when()
		.patch("https://reqres.in/api/users/2")
		
		.then()
		.statusCode(200)
		.log().all();
		//.log().body()
				
		//.body("name", equalTo ("Rayhan"));
		
	
	
	}	
}
