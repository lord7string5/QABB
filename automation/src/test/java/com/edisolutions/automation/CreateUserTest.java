package com.edisolutions.automation;

//Manual insert for rest assured for given()
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

public class CreateUserTest {
	
	@Test
	public void createUser() {
		
		JSONObject json =new JSONObject();
		json.put("name", "Samrat");
		json.put("job", "King");
		
		//NEEDS Rest Assured package
		Response res = given().
				body(json.toString()).
				when().
				post("https://reqres.in/api/users");
			
		
		//check 
		res.then().
			statusCode(201).log().all().
			//using hamcrest
			////works as long as value matches
			//body("createdAt", equalTo("2020-08-28"));
			assertThat().body("$", hasKey("id"));
	}

}
