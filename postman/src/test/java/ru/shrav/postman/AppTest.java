package ru.shrav.postman;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class AppTest {
	@Test
	public void testStatusCode() {
	given()
	 .baseUri("https://postman-echo.com")
	 .when()
	 .get("/cookies")
	 .then()
	 .assertThat()
	 .statusCode(200);
	}
	
	@Test
	public void whenCreatePerson_thenStatus201() {
	 given().baseUri("https://postman-echo.com")
	 .contentType("application/json").body("This is expected to be sent back as part of response body.")
	 .when().post("/post")
	 .then().assertThat()
	 .statusCode(200)
	 .and().body("data", equalTo("This is expected to be sent back as part of response body."))
	 .and().body("files", equalTo(Matchers.empty()));
	}
	
}