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
public class payButtonPage {

	public payButtonPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="btnSTotal_reserve")
	private WebElement payButton;

	public WebElement getPayButton() {
		return payButton;
	}



}
