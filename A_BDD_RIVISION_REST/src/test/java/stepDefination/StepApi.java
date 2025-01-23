package stepDefination;

import BaseApi.BaseApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import reader.JsonReader;
import reader.PropertyReader;

public class StepApi extends BaseApi{
	@Given("configure base uri")
	public void configure_base_uri() {
	     
	 RestAssured.baseURI=PropertyReader.getProperty("BASE_URI");
	}

	@Then("get request specification object")
	public void get_request_specification_object() {
	     BaseApi.reqSpec();
	 
	}
	@Then("create request payload")
	public void create_request_payload() {
	   
	 
	}
	@Then("attach request payload to request")
	public void attach_request_payload_to_request() {
	     
	 
	}
	@Then("select http post request")
	public void select_http_post_request() {
	     
	 
	}


}
