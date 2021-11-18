package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/***
 * 
 * @author Sharon Jasphin
 *
 */
public class genresTypePage {

	public genresTypePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="	//div[text()='Genres']")
	private WebElement genres;

	@FindBy(xpath="	//div[text()='Genres']/../..//div[contains(@class,'DesktopOnlyContainer')]//div[text()='Action']")
	private WebElement Action;


	public WebElement getGenres() {
		return genres;
	}

	public WebElement getAction() {
		return Action;
	}





}
