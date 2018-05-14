# craigslist-categorries


This is a spring boot REST API to fetch few default categories on https://toronto.craigslist.ca/

How to run the code :

Instructions :
1. git clone https://github.com/rameshwarsingh11/craigslist-categorries.git
2. Import the project in Eclipse
3. run mvn clean compile package install
4. Run the CategoryBoot.java ( Run as Java Application / SpringBoot application)
5. go to http://127.0.0.1:8087/categories


Landing API Method : categorySearch

On hitting the URL : http://127.0.0.1:8087/categories  below method is executed. This API is GET based and produces JSON response.

@RequestMapping(value = "/categories", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Category> categorySearch() throws IOException {
    //
  }


  Sample response :
  [{"categoryName":"activities","webLink":"https://toronto.craigslist.ca/d/activity-partners/search/act"},
  {"categoryName":"artists","webLink":"https://toronto.craigslist.ca/d/artists/search/ats"},
  {"categoryName":"childcare","webLink":"https://toronto.craigslist.ca/d/childcare/search/kid"},
  {"categoryName":"travel","webLink":"https://forums.craigslist.org/?areaID=25&forumID=42"},
  {"categoryName":"tv","webLink":"https://forums.craigslist.org/?areaID=25&forumID=98"},
  {"categoryName":"vegan","webLink":"https://forums.craigslist.org/?areaID=25&forumID=2400"},
  {"categoryName":"words","webLink":"https://forums.craigslist.org/?areaID=25&forumID=7000"},
  {"categoryName":"writing","webLink":"https://forums.craigslist.org/?areaID=25&forumID=27"}]
