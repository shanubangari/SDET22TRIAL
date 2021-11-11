package com.authenticatiionTestSripts;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicAuthTest {
	@Test
	public void basicAuthTest() {
		given()
			.auth().basic("rmgyantra", "rmgy@9999")
		.when()
			.get("http://localhost:8084")
		.then()
			.log().all();
	}

}