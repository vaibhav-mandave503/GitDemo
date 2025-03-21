package Test;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReqRes {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://reqres.in";
		String getResponse =   given().log().all().when().get("/api/users/2")
				.then().assertThat().statusCode(200).extract().response().asString();
		System.out.println("getResponse:\n"+getResponse);
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("name","samar");
		hm.put("job","lead");

		Response postResponse = given().log().all()
				.header("Content-Type","application/JSON")
				.when().body(hm).log().all()
				.post("/api/users");
				
		System.out.println("postResponse:\n"+postResponse.asPrettyString());
		System.out.println("postResponse Headers:\n"+postResponse.headers());
		System.out.println("postResponse Header Content-Type:"+postResponse.header("Content-Type"));
		System.out.println("postResponse Cookie:"+postResponse.getCookie("JSESSIONID"));
		String JSESSIONID = postResponse.getCookies().get("JSESSIONID");
		System.out.println("postResponse Cookie:"+JSESSIONID);
		
		@SuppressWarnings("unused")
		Map<String, String> cookieMap = postResponse.getCookies();
		
		System.out.println("Printing Cookie Key and Value");
		Iterator<Entry<String, String>> iterator = cookieMap.entrySet().iterator();
		
		if (!cookieMap.isEmpty())
		{
	       while (iterator.hasNext()) {
	           Entry<String, String> entry = iterator.next();
	           System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	       }
	   	
		}
	       
	}
}
