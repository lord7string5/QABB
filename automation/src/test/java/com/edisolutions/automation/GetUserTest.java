package com.edisolutions.automation;

//Manual insert for rest assured for given()
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;


public class GetUserTest {

	@Test
	public void getUser() {
		
		//NEEDS Rest Assured package
		given().
		get("https://reqres.in/api/users").
		then().statusCode(200).log().all();
	}	

}
