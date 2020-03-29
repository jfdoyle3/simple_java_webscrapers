package unirest_scraper;



import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.apache.http.HttpHost;


public class console_scraper {

	public static void main(String[] args) throws Exception {
		
		// Basic usage to get a json response.
		//final HttpResponse<String> basicResponse=Unirest.get("http://httpbin.org/get").asString();
		//System.out.println(basicResponse.getBody());

		// Send a two args query and get a json response.
		//final HttpResponse<String> queryResponse=Unirest.get("http://httpbin.org/get").queryString("CareerDevs",2020).asString();
		//System.out.println(queryResponse.getBody());
		
//  ---------------------------------------------------- 		
		
		// Change the default user-agent header
		Unirest.setDefaultHeader("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0");
		
		//Use a proxy
		Unirest.setProxy(new HttpHost("2.56.151.240",80));
		
		
		//Parse out json response and display a json key
		//Make a single get to httpbin.org
		final HttpResponse<JsonNode> getResponse=Unirest.get("http://httpbin.org/get").queryString("CareerDevs",2020).asJson();
		System.out.println("Proxy address: "+ getResponse.getBody().getObject().getString("origin"));
		System.out.println("User-Agent: "+ getResponse.getBody().getObject().getJSONObject("headers").getString("User-Agent"));
		
		System.out.println("\n\n--------------------------------------------------------\n\n");
		
		//Make a POST
		final HttpResponse<String> postResponse=Unirest.post("http://httpbin.org/post").field("postalcode", 12345).asString();
		System.out.println(postResponse.getBody());
		
	}

}
