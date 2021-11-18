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
public class theatersPage {

	public theatersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Sampige Digital 2k Cinema: Malleshwaram']/../../../../..//div[contains(text(),'04:30')]")
	private WebElement theater;

	@FindBy(xpath="//a[text()='Mohan Cinema Barco 4K A/C 7.1: Sunkadakatte']/../../../../..//div[contains(text(),'10:00')]")
	private WebElement theater2;

	@FindBy(xpath = "//a[text()='INOX: Galleria Mall, Yelahanka']/../../../../..//div[contains(text(),'03:35')]")
	private WebElement theaterformat;

	public WebElement getTheater() {
		return theater;


	}

	public WebElement getTheater2() {
		return theater2;
	}

	public WebElement getTheaterformat() {
		return theaterformat;
	}





}
