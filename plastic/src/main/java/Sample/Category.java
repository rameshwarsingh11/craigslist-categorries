/**
 * 
 */
package Sample;

/**
 * @author Rameshwar Singh
 *
 */
public class Category {

	/**
	 * name of Category
	 */
	private String categoryName;

	/**
	 * web Link;
	 */
	private String webLink;

	/**
	 * Overloaded constructor
	 * 
	 * @param categoryName
	 *            String
	 * @param webLink
	 *            String
	 */
	public Category(String categoryName, String webLink) {
		this.categoryName = categoryName;
		this.webLink = webLink;
	}

	/**
	 * Default constructor
	 */
	public Category() {

	}

	/**
	 * @return the categryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categryName
	 *            the categryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return the webLink
	 */
	public String getWebLink() {
		return webLink;
	}

	/**
	 * @param webLink
	 *            the webLink to set
	 */
	public void setWebLink(String webLink) {
		this.webLink = webLink;
	}

}
