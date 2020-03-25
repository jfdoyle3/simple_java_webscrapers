package google_scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.net.URLEncoder;

public class console_scraper {

	//Scrape: https://www.google.com/search?q=apple
    //tag query: h3.r a
	
	//Declare a Variable
	public static final String USER_AGENT="Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0";
	
	public static void main(String[] args) throws IOException {
		
		//User Query
		final String query="apple";
		
		//Download requested page and append user query to it.
		final Document page=Jsoup.connect("https://www.google.com/search?q="+URLEncoder.encode(query,"UTF-8")).userAgent(USER_AGENT).get();
		
		//Iterate and Output to console the Title and URL link of query.
		for (Element searchResult : page.select("h3.r a")) {
			
			//Get Text from Tag
			final String title=searchResult.text();
			
			//Get URL from Tag
			final String url=searchResult.attr("href");
			
			//Display to console
			System.out.println(title + " >>---> " + url );
		}

	}
}
