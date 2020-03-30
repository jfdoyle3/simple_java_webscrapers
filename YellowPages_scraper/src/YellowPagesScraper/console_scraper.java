package YellowPagesScraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class console_scraper {

	public static void main(String[] args) throws Exception {

		
		  final String search="bicycle";
		  final String where="ri";

		 

		final HttpResponse<String> response = Unirest
				.get("https://www.yellowpages.com/search?")
				.queryString("search_terms", search)
				.queryString("geo_location",where)
				.asString();
		 
		System.out.println(response.getBody());

		
		  final Document htmlSnippet = Jsoup.parseBodyFragment(response.getBody());
		  System.out.println("Got Snippet");
		  System.out.println(htmlSnippet.outerHtml());
		 
		// for (Element peopleResult : htmlSnippet.select("div.row > div.col-md-12 >
		// div.row > div.col-md-11")) {
		/*
		 * for (Element peopleResult : htmlSnippet.select("div.wrapper")) {
		 * System.out.println("results:"); System.out.println(peopleResult.outerHtml());
		 * //System.out.println(peopleResult.child(0).text());
		 * 
		 * final String name=peopleResult.child(0).text(); final String
		 * age=peopleResult.child(1).text();
		 * 
		 * 
		 * }
		 */
		System.out.println("end of line");
	}
}
