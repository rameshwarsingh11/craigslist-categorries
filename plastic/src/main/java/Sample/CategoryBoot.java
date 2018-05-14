package Sample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring boot REST API to do search on craigslist and retrieve results.
 * 
 * @author Rameshwar
 *
 */
@RestController
@SpringBootApplication
public class CategoryBoot {
	/**
	 * GET method to provide the categories listed on https://toronto.craigslist.ca
	 * in JSON.
	 * 
	 * @return List of Categories in JSON.
	 * @throws IOException
	 */
	@RequestMapping(value = "/categories", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Category> categorySearch() throws IOException {
		List<Category> cat = new ArrayList<>();
		String url = "https://toronto.craigslist.ca";
		Document document = Jsoup.connect(url).get();
		Elements communities = document.select("div.community");
		for (Element community : communities) {
			Elements categories = community.select("div.cats");
			for (Element category : categories) {
				String html = category.html();
				Document doc = Jsoup.parse(html);
				Elements links = doc.select("ul li a");
				for (Element link : links) {
					Category categoryObj = new Category();
					if (null!=link.attr("href") && !link.attr("href").contains("http"))
					{
						categoryObj.setWebLink(url+link.attr("href"));
					}
					else
					{
					categoryObj.setWebLink(link.attr("href"));
					}
					categoryObj.setCategoryName(link.text());
					cat.add(categoryObj);
				}
			}
		}
		return cat;
	}

	/**
	 * Spring boot starter method.
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		SpringApplication.run(CategoryBoot.class, args);
	}
}