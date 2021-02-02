package restAssurBDDpractice;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Deleterequest {
	
	@Test
	public void deletereq() {
		
		
		given()
		.when()
		//.delete("https://reqres.in/api/users/2")
		
		.delete("http://dummy.restapiexample.com/api/v1/delete/2")
		.then()
		.statusCode(200);
		
		
	}

}
