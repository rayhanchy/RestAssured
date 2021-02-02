package restAssurBDDpractice;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Getrequestpractice {
	
	
@Test
public void TC001_getrequestpractice01() {
	
	given()
	.when()
	.get("https://reqres.in/api/users?page=2")
	.then()
	.statusCode(200)
	.log().body()
	.body("data.id[3]", equalTo(10))
	.body("data.first_name[1]", equalTo("Lindsay"));

	
}

//@Test
public void getsingleuser() {
	
	given()
	.when()
	.get("https://reqres.in/api/users/2")
	.then()
	.statusCode(200)
	.log().body()
	.log().all();
	
	
}
	
//@Test
public void TC003_Listresource() {
	
	given()
	.when()
	.get("https://reqres.in/api/unknown")
	.then()
	.log().body()
	.log().all()
	.body("data.id[1]", equalTo (2))
	.body("data.name[3]", equalTo("aqua sky"));
	
	
}


}
