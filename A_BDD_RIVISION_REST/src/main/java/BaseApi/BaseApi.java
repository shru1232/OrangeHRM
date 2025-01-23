package BaseApi;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseApi {
	
	protected static RequestSpecification httpReq;
	public static void reqSpec() {
		
	 httpReq=RestAssured.given().contentType(ContentType.JSON).log().all();
		
	}

}
