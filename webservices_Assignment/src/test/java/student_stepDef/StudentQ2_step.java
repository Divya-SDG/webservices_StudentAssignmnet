package student_stepDef;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.comparesEqualTo;

import java.util.*;
import cucumber.api.java.en.*;
import cucumber.runtime.junit.Assertions;
import io.restassured.*;
import io.restassured.common.mapper.TypeRef;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import webservices_Assignment.User;

public class StudentQ2_step {
	
	private Response response;
	private ValidatableResponse validResp;
	private RequestSpecification request;
	String URL = "https://jsonplaceholder.typicode.com";
	String end_point="/posts";
static String getRequest_URI;


	
	@Given("^set the GET method as /posts$")
	public void set_the_GET_method_as_posts() throws Throwable {
		 getRequest_URI = URL+ end_point ;
		 request= RestAssured.given();
	    
	}
	
  
	@When("^Get the webservices https://jsonplaceholder\\.typicode\\.com/posts$")
	public void get_the_webservices_https_jsonplaceholder_typicode_com_posts() throws Throwable {
	   response= request.when().get(getRequest_URI);
	   System.out.println("response: " + response.prettyPrint());
	}

	
	@Then("^check the status code is (\\d+)$")
	public void check_the_status_code_is(int StatusCode) throws Throwable {
		validResp = response.then().statusCode(StatusCode); 
	}

	
    @Then("^check if response body  includes$")
	public void check_if_response_body_includes() throws Throwable {
		
		 		List<Integer> User_ID  = response.jsonPath().get("userId");
		 		
		 		assertThat(User_ID, hasItem(7));
		        System.out.println(User_ID);
		  }

		 
	
	   @Then("^get the value of title from the response with userID$")
	   
		public void get_the_value_of_title_from_the_response_with_userID() throws Throwable {
		
		   String title;
		List<Integer> User_ID  = response.jsonPath().get("userId");
		for(int i=0;i<User_ID.size();i++) {
			Integer user_id= response.jsonPath().get("["+i+"].userId");
			String userid= Integer.toString(user_id);
			
			if(userid.equalsIgnoreCase("7")){
			 title= response.jsonPath().get("["+i+"].title");
			 System.out.println(title);
			}
		
			
			
		}
		
		}

}




	
	    
	


	