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
public class regionWiseListPage {


	public regionWiseListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Abhinay Theatre 4K A/C: Gandhinagar")
	private WebElement Theater2;

	@FindBy(xpath="(//a[contains(text(),'Sooryavanshi')]/../../../..	//div[contains(text(),'07:30')])[1]")
	private WebElement suryavanshi;


	public WebElement getTheater2() {
		return Theater2;
	}



	public WebElement getSuryavanshi() {
		return suryavanshi;
	}



}
