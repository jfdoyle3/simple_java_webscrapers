package unirest_scraper;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;


public class console_scraper {

	public static void main(String[] args) throws Exception {
		
		final HttpResponse<String> response=Unirest.get("http://httpbin.org/get").asString();
		
		System.out.println(response.getBody());

	}

}
