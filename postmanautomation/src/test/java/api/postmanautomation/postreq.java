package api.postmanautomation;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postreq {
	
	
   @Test
   void post_req() {
	   
	  // specify base URI 
	   
	    RestAssured.baseURI ="http://restapi.demoqa.com/customer";
	  
	  // request object 
	  
	    RequestSpecification  httpRequest = RestAssured.given();
	  
	 	  
	  // request payload sending along with post request
	  
	  JSONObject requestparams= new JSONObject();
	  
	  requestparams.put("FirstName", "ms");
	  requestparams.put("LastName", "raju");
	  requestparams.put("UserName", "rudrams123");
	  requestparams.put("Password", "1234567");
	  requestparams.put("Email", "ms@gmail.com");
	  
	  
	  httpRequest.header("Content-type","application/json"); // header
	  
	  httpRequest.body(requestparams.toJSONString());
	  
	    //  path parameter (Response object)
	  
	 Response response = httpRequest.request(Method.POST,"/registers");
	 
	    // Print response in console window
		
		String responseBody = response.getBody().asString();
		System.out.println("ResponseBody:" +responseBody);
		
		// status code 
		int statuscode = response.getStatusCode();
		System.out.println("status code: " +statuscode);
		
		// status line verification
		String statusline = response.getStatusLine();
		System.out.println("Status line is: "+ statusline);
	
	
	
	   
	   
	
}

}
