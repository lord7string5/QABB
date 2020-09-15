package com.edisolutions.automation;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class EditUserTest {
	

	@Test
	public void editUser() {
		
		JSONObject json =new JSONObject();
		json.put("name", "Samrat");
		json.put("job", "Emperor");
		
		//NEEDS Rest Assured package
		given().
		body(json.toString()).
		when().
		put("https://reqres.in/api/users/784").
		then().statusCode(200).log().all();
	}

}
