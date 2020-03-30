package main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

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
		//System.out.println(response.getBody());
		
		final Document htmlSnippet=Jsoup.parseBodyFragment(response.getBody());
		
		for (Element peopleResult : htmlSnippet.select("div.row > div.col-md-12 > div.row > div.col-md-11")) {
			System.out.println(peopleResult.child(0).text());
			/*
			 * final String name=peopleResult.child(0).text(); final String
			 * age=peopleResult.child(1).text();
			 */
			
			}
	}

}
