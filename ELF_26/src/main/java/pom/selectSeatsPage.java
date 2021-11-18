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
public class selectSeatsPage {


	public selectSeatsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[contains(text(),'Select Seats')]")
	private WebElement selectseat;


	public WebElement getSelectseat() {
		return selectseat;
	}



}
