package main;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class PeopleFinderScraper {

	public static void main(String[] args) throws Exception{
	
		final String lastName="smith";
		final String firstName="same";
		final String city="New York";
		final String state="ny";
			
		final HttpResponse<String> response=Unirest.get("https://www.peoplefinders.com/api/widget/widgets?totalRecords=10")
												   .queryString("firstName", firstName)
												   .queryString("lastName", lastName)
												   .queryString("city",city)
												   .queryString("start", state)
												   .asString();
		System.out.println(response.getBody());
	}

}
