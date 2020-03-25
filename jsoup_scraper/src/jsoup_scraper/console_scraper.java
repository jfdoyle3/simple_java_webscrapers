package jsoup_scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class console_scraper {
	
	public static void main(String[] args) throws IOException {
	
	//Downloads the html from wikipedia and parses it
	final Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
	
	//Selects a bunch of tags
	final Elements newsHeadlines = doc.select("#mp-itn b a");
	
	//Outputs to console the headlines from page
	for (Element headline : newsHeadlines) {
		System.out.println(headline.text());
	}
	
	System.out.println("\n\n--------------------------------------------------------\n\n");
	
	//Output to console the html: outerhtml()
	System.out.println(doc.outerHtml());
  }	
}
