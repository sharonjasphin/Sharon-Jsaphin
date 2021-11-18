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
public class daylistPage {

	public daylistPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[contains(text(),'TOM')]	")
	private WebElement Daylist;

	@FindBy(xpath="//div[contains(text(),'TOM')]")
	private WebElement Daylist2;


	public WebElement getDaylist() {
		return Daylist;
	}
	public WebElement getDaylist2() {
		return Daylist2;
	}





}
