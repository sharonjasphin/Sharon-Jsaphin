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
public class formatsPage {


	public formatsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	@FindBy(xpath="//div[text()='Eternals']")
	private WebElement movie;

	@FindBy(xpath="(//div[text()='IMAX 2D'])[2]")
	private WebElement formatmovie;

	@FindBy(xpath = "//span[text()='IMAX 2D']")
	private WebElement formatmovie2;

	public WebElement getMovie() {
		return movie;
	}

	public WebElement getFormatmovie() {
		return formatmovie;
	}

	public WebElement getFormatmovie2() {
		return formatmovie2;
	}




}