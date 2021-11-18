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
public class numberOfSeatsPage {


	public numberOfSeatsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='BC']/../..//a[contains(text(),'32')]")
	private WebElement seats;

	@FindBy(xpath="(//div[text()='BALCONY-Rs. 150.00']/../../..//div[text()='A']/../..//a[contains(text(),'10')])[1]")
	private WebElement seats2;


	public WebElement getSeats() {
		return seats;
	}


	public WebElement getSeats2() {
		return seats2;
	}


}


