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
public class termsAndConditionsPage {

	public termsAndConditionsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="btnPopupAccept")
	private WebElement Acceptterms;



	public WebElement getAcceptterms() {
		return Acceptterms;
	}



}
