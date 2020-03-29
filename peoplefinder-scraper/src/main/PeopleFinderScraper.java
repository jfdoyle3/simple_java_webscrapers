package main;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class PeopleFinderScraper {

	public static void main(String[] args) throws Exception{
	

		final HttpResponse<String> response=Unirest.get("https://www.peoplefinders.com/api/widget/widgets?firstName=sam&lastName=smith&city=new-york&state=ny&totalRecords=10").asString();
		System.out.println(response.getBody());
	}

}
