package unirest_scraper;




public class console_scraper {

	public static void main(String[] args) throws Exception {
		
		Unirest.get("http://htpbin.org/get").asString();
		
		System.out.println(response.getBody());

	}

}
