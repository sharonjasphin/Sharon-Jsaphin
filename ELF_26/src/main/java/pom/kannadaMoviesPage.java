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
public class kannadaMoviesPage {


	public kannadaMoviesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='Tom & Jerry (Kannada)']") 
	private WebElement kannadamovie;

	public WebElement getKannadamovie() {
		return kannadamovie;
	}



}


