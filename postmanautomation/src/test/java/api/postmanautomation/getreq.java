package api.postmanautomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class getreq {
	
	
	@Test
	void getrequestdemo() {
		
		// Specify Base URI 
		RestAssured.baseURI="https://reqres.in/api/users";
		
		// Request Object
		RequestSpecification httpRequest=RestAssured.given();
		
		// Response Object 
		Response response = httpRequest.request(Method.GET,"/2");
		
		// Print response in console window
		
		String responseBody = response.getBody().asString();
		System.out.println("ResponseBody:" +responseBody);
		
		// status code 
		int statuscode = response.getStatusCode();
		System.out.println("status code: " +statuscode);
		Assert.assertEquals(statuscode,200);
		
		// status line verification
		String statusline = response.getStatusLine();
		System.out.println("Status line is: "+ statusline);
		
		
		
		
		
	}

}
