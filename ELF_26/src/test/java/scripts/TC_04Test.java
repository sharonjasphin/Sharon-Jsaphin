package scripts;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generic_library.BaseClass;
import pom.homePage;
import pom.bookTicketPage;
import pom.daylistPage;
import pom.filtersPage;
import pom.kannadaMoviesPage;
import pom.selectSeatsPage;
import pom.termsAndConditionsPage;
import pom.theatersPage;

/***
 * 
 * @author Sharon Jasphin
 *
 */
@Listeners(generic_library.ITestListeners.class)

public class TC_04Test extends BaseClass {

	@Test
	public void selectMovieByLanguage() {

		//Precondition
		String url = "https://in.bookmyshow.com/explore/home/bengaluru";
		String homepageTitle = "Movie Tickets, Plays, Sports, Events & Cinemas near Bengaluru - BookMyShow";

		//Step -1 Validate URL
		String currentUrl = driver.getCurrentUrl();
		assertEquals(url, currentUrl, "URL is not entered properly");

		//Step-2 Validate Homepage is displayed or not
		String actualhomepageTitle = driver.getTitle();
		assertEquals(actualhomepageTitle, homepageTitle , "HomePage is not displayed");
		homePage hp=new  homePage(driver);
		hp.getPopup().click();
		hp.getMoviesButton().click();

		//step-3 click KannadaMovie Button
		filtersPage filter=new filtersPage(driver);
		filter.getKannada().click();
		kannadaMoviesPage movies=new kannadaMoviesPage(driver);
		movies.getKannadamovie().click();

		//step-4 click book Ticket Button
		bookTicketPage book= new bookTicketPage(driver) ;
		book.getBookTicket().click();

		//step-5 click daylist Button
		daylistPage list=new daylistPage(driver);
		list.getDaylist();

		//step-6 click Theaterpage Button
		theatersPage th= new theatersPage(driver);
		th.getTheater2().click();

		//step-7 click Terms and Condition Button
		termsAndConditionsPage terms= new termsAndConditionsPage(driver);
		terms.getAcceptterms().click();

		//step-8 click selectseat page Button 
		selectSeatsPage ss=new selectSeatsPage(driver);
		ss.getSelectseat().click();
		driver.quit();

	}
}
