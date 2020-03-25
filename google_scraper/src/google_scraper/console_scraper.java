package google_scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URLEncoder;
public class console_scraper {

	//Scrape: https://www.google.com/search?q=apple
    //tag query: v:h3.r a      my guess for me: div.r a
	
	public static void main(String[] args) throws IOExecption {
		
		final String query="apple";
		
		final Document page=Jsoup.connect("https://www.google.com/search?q="+URLEncoder.encode(query,"UTF-8")).get();
		
		System.out.println(page.outerHtml());

	}

}
