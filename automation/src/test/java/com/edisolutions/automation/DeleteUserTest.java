package com.edisolutions.automation;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;


public class DeleteUserTest {
	

	@Test
	public void deleteUser() {
		
		//NEEDS Rest Assured package
		given().
		delete("https://reqres.in/api/users/744").
		then().statusCode(204).log().all();
		
		
	}	

}
