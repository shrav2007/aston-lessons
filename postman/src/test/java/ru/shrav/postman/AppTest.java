package ru.shrav.postman;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;

public class AppTest {
	@Test
	public void testStatusCode() {
		given().baseUri("https://postman-echo.com").when().get("/cookies").then().assertThat().statusCode(200);
	}

	@Test
	public void postRawText() {
		given().baseUri("https://postman-echo.com").contentType("text/json")
				.body("This is expected to be sent back as part of response body.").when().post("/post").then()
				.assertThat().statusCode(200).and()
				.body("data", equalTo("This is expected to be sent back as part of response body.")).and()
				.body("files.size", equalTo(null)).and().body("form.size", equalTo(null)).and()
				.body("headers.x-forwarded-proto", equalTo("https")).and()
				.body("headers.x-forwarded-port", equalTo("443")).and()
				.body("headers.host", equalTo("postman-echo.com")).and()
				.body("headers.x-amzn-trace-id", is(notNullValue())).and()
				.body("headers.content-length", equalTo("58")).and()
				.body("headers.content-type", containsString("text/json")).and()
				.body("headers.user-agent", is(notNullValue())).and()
				.body("headers.accept", equalTo("*/*")).and()
				.body("headers.accept-encoding", equalTo("gzip,deflate"));
	}
	
//	@Test
//	public void whenCreatePerson_thenStatus202() throws JSONException {
//		JSONObject jsonObj = new JSONObject()
//                .put("foo1","bar1")
//                .put("foo2","bar2");
//		 given().baseUri("https://postman-echo.com").contentType(ContentType.JSON)
//			.body(jsonObj.toJSONString()).when().post("/post").then()
//			.assertThat().statusCode(200).and().body("form.foo1", equalTo("bar1"));
//	}
	
	@Test
	public void putRequest() {
		given().baseUri("https://postman-echo.com").contentType("text/json")
				.body("This is expected to be sent back as part of response body.").when().put("/put").then()
				.assertThat().statusCode(200).and()
				.body("data", equalTo("This is expected to be sent back as part of response body.")).and()
				.body("files.size", equalTo(null)).and().body("form.size", equalTo(null)).and()
				.body("headers.x-forwarded-proto", equalTo("https")).and()
				.body("headers.x-forwarded-port", equalTo("443")).and()
				.body("headers.host", equalTo("postman-echo.com")).and()
				.body("headers.x-amzn-trace-id", is(notNullValue())).and()
				.body("headers.content-length", equalTo("58")).and()
				.body("headers.content-type", containsString("text/json")).and()
				.body("headers.user-agent", is(notNullValue())).and()
				.body("headers.accept", equalTo("*/*")).and()
				.body("headers.accept-encoding", equalTo("gzip,deflate"));
	}

	@Test
	public void patchRequest() {
		given().baseUri("https://postman-echo.com").contentType("text/plain")
				.body("This is expected to be sent back as part of response body.").when().patch("/patch").then()
				.assertThat().statusCode(200).and()
				.body("data", equalTo("This is expected to be sent back as part of response body.")).and()
				.body("files.size", equalTo(null)).and().body("form.size", equalTo(null)).and()
				.body("headers.x-forwarded-proto", equalTo("https")).and()
				.body("headers.x-forwarded-port", equalTo("443")).and()
				.body("headers.host", equalTo("postman-echo.com")).and()
				.body("headers.x-amzn-trace-id", is(notNullValue())).and()
				.body("headers.content-length", equalTo("58")).and()
				.body("headers.content-type", containsString("text/plain")).and()
				.body("headers.user-agent", is(notNullValue())).and()
				.body("headers.accept", equalTo("*/*")).and()
				.body("headers.accept-encoding", equalTo("gzip,deflate"));
	}
	
	@Test
	public void deleteRequest() {
		given().baseUri("https://postman-echo.com").contentType("text/plain")
				.body("This is expected to be sent back as part of response body.").when().delete("/delete").then()
				.assertThat().statusCode(200).and()
				.body("data", equalTo("This is expected to be sent back as part of response body.")).and()
				.body("files.size", equalTo(null)).and().body("form.size", equalTo(null)).and()
				.body("headers.x-forwarded-proto", equalTo("https")).and()
				.body("headers.x-forwarded-port", equalTo("443")).and()
				.body("headers.host", equalTo("postman-echo.com")).and()
				.body("headers.x-amzn-trace-id", is(notNullValue())).and()
				.body("headers.content-length", equalTo("58")).and()
				.body("headers.content-type", containsString("text/plain")).and()
				.body("headers.user-agent", is(notNullValue())).and()
				.body("headers.accept", equalTo("*/*")).and()
				.body("headers.accept-encoding", equalTo("gzip,deflate"));
	}
}