package unirest_scraper;



import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;



public class console_scraper {

	public static void main(String[] args) throws Exception {
		
		// Basic usage to get a json response.
		//final HttpResponse<String> basicResponse=Unirest.get("http://httpbin.org/get").asString();
		//System.out.println(basicResponse.getBody());

		// Send a two args query and get a json response.
		//final HttpResponse<String> queryResponse=Unirest.get("http://httpbin.org/get").queryString("CareerDevs",2020).asString();
		//System.out.println(queryResponse.getBody());
		
		//Parse out json response and display a json key
		//Make a single get to httpbin.org
		final HttpResponse<JsonNode> response=Unirest.get("http://httpbin.org/get").queryString("CareerDevs",2020).asJson();
		System.out.println(response.getBody().getObject().getString("origin"));
		
		
		
	}

}
