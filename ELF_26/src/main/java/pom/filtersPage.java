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
public class filtersPage {

	public filtersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[contains(@class,'DesktopOnlyContainer')]//div[text()='Browse by Cinemas']")
	private WebElement browseBycinemas;


	@FindBy(xpath="//div[text()='Annaatthe']") 
	private WebElement MovieOnscreen;

	@FindBy(xpath="//h1[contains(@class,'styles__DesktopTitle-sc-b1h692-7 inQwLR')]/../..//div[text()='English']")
	private WebElement English;

	@FindBy(xpath="//h1[contains(@class,'styles__DesktopTitle-sc-b1h692-7 inQwLR')]/../..//div[text()='Kannada']")
	private WebElement Kannada;

	@FindBy(xpath="//h1[contains(@class,'styles__DesktopTitle-sc-b1h692-7 inQwLR')]/../..//div[text()='Teleugu']")
	private WebElement Telugu;

	@FindBy(xpath="//h1[contains(@class,'styles__DesktopTitle-sc-b1h692-7 inQwLR')]/../..//div[text()='Tamil']")
	private WebElement Tamil;

	@FindBy(xpath="//h1[contains(@class,'styles__DesktopTitle-sc-b1h692-7 inQwLR')]/../..//div[text()='English 7D']")
	private WebElement English_7D;

	@FindBy(xpath="//h1[contains(@class,'styles__DesktopTitle-sc-b1h692-7 inQwLR')]/../..//div[text()='Korean']")
	private WebElement Korean;

	@FindBy(xpath="//h1[contains(@class,'styles__DesktopTitle-sc-b1h692-7 inQwLR')]/../..//div[text()='Hindi']")
	private WebElement Hindi;

	@FindBy(xpath="//h1[contains(@class,'styles__DesktopTitle-sc-b1h692-7 inQwLR')]/../..//div[text()='Malayalam']")
	private WebElement Malyalam;

	@FindBy(xpath="//h1[contains(@class,'styles__DesktopTitle-sc-b1h692-7 inQwLR')]/../..//div[text()='Punjabi']")
	private WebElement Punjabi;


	public WebElement getBrowseBycinemas() {
		return browseBycinemas;
	}

	public WebElement getMovieOnscreen() {
		return MovieOnscreen;
	}

	public WebElement getEnglish() {
		return English;
	}

	public WebElement getKannada() {
		return Kannada;
	}

	public WebElement getTelugu() {
		return Telugu;
	}

	public WebElement getTamil() {
		return Tamil;
	}

	public WebElement getEnglish_7D() {
		return English_7D;
	}

	public WebElement getKorean() {
		return Korean;
	}

	public WebElement getHindi() {
		return Hindi;
	}

	public WebElement getMalyalam() {
		return Malyalam;
	}

	public WebElement getPunjabi() {
		return Punjabi;
	}











}
