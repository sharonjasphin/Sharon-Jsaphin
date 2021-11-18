package scripts;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generic_library.BaseClass;
import pom.homePage;
import pom.bookTicketPage;
import pom.daylistPage;
import pom.filtersPage;
import pom.selectSeatsPage;
import pom.termsAndConditionsPage;
import pom.theatersPage;

/***
 * 
 * @author Sharon Jasphin
 *
 */


@Listeners(generic_library.ITestListeners.class)
public class TC_01Test extends BaseClass{

	@Test
	public void selectMoviesOnscreen() {

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

		//step-3 click Movies on Screen Button
		filtersPage filter=new filtersPage(driver);
		filter.getMovieOnscreen().click();


		//step-4 click Book Ticket Button
		bookTicketPage bookTicket=new bookTicketPage(driver);
		bookTicket.getBookTicket().click();

		//step-5 click daylist Button
		daylistPage daylist=new daylistPage(driver);
		daylist.getDaylist().click();

		//step-6 click Theater Button
		theatersPage theater=new theatersPage(driver);
		theater.getTheater().click();

		//step-7 click TermsAndCondition Button
		termsAndConditionsPage terms= new termsAndConditionsPage(driver);
		terms.getAcceptterms().click();

		//step-8 click selectSeat Button
		selectSeatsPage selectseats=new selectSeatsPage(driver);
		selectseats.getSelectseat().click();
		driver.quit();



	}

}
