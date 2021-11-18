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
public class homePage {

	public homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[@class='Sign me Up!']")
	private WebElement popup;

	@FindBy(xpath="//span[text()='Bengaluru']")
	private WebElement locationbutton;

	@FindBy(linkText="Movies") 
	private WebElement MoviesButton;



	public WebElement getPopup() {
		return popup;
	}

	public WebElement getLocationbutton() {
		return locationbutton;
	}

	public WebElement getMoviesButton() {
		return MoviesButton;
	}


}
