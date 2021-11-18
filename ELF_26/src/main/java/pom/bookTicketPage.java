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
public class bookTicketPage {

	public bookTicketPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//button[@data-phase='postRelease'])[1]") 
	private WebElement BookTicket;

	@FindBy(xpath="//span[text()='Rate now']")
	private WebElement Ratenow;


	public WebElement getBookTicket() {
		return BookTicket;
	}

	public WebElement getRatenow() {
		return Ratenow;
	}





}
