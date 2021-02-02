package restAssurBDDpractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Putrequest {
	
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
		.put("https://reqres.in/api/users/2")
		//.put("http://dummy.restapiexample.com/api/v1/update/21")
		.then()
		.statusCode(200)
		.log().all()
		//.log().body()
				
		.body("name", equalTo ("morpheus"));
		
		
	
		
		
		
		
		
	}
	

}
