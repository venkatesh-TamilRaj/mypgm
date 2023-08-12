package com.RestApi;

import org.junit.runner.Request;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_Api {
	@Test
	private void dataValidation() {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://gorest.co.in/";
		RequestSpecification request =RestAssured.given();
		Response responce = request.get("https://gorest.co.in/public/v2/users");
		String asString = responce.asString();
		System.out.println(asString);
		int statuscode =responce.getStatusCode();
		junit.framework.Assert.assertEquals(statuscode, 200);
		System.out.println("successfull");
	}

}
