package restAssurBDDpractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Postrequest {
	
	@Test
	public void postreq() {
		
		JSONObject requestbody = new JSONObject();
		
		requestbody.put("Name", "Morpheus");
		requestbody.put("Job", "Leader");
		
		System.out.println(requestbody);
		
		given()
		.header("Content-Type",  "application/json" )
		.accept(ContentType.JSON)
		.body(requestbody.toJSONString())
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.log().all()
		//.log().body()
		
											//now validation
		.body("Name", equalTo("Morpheus"));
		
	
		
		
	}

}
