package scripts;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generic_library.BaseClass;
import pom.homePage;
import pom.bookTicketPage;
import pom.formatsPage;
import pom.movieByFormatPage;
import pom.selectSeatsPage;
import pom.termsAndConditionsPage;
import pom.theatersPage;
/***
 * 
 * @author Sharon Jasphin
 *
 */
@Listeners(generic_library.ITestListeners.class)

public class TC_05Test extends BaseClass{

	@Test
	public void selectformat() throws InterruptedException {

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

		//step-3 click Movie by format Button
		movieByFormatPage movie= new movieByFormatPage(driver);
		movie.getFormat().click();
		formatsPage format= new formatsPage(driver);
		format.getFormatmovie().click();
		format.getMovie().click();
		Thread.sleep(3000);

		//step-4 click bookTicket Button
		bookTicketPage bk=new bookTicketPage(driver);
		bk.getBookTicket().click();
		Thread.sleep(3000);

		//step-5 click format Button
		formatsPage format2= new formatsPage(driver); 
		format2.getFormatmovie2().click();

		//step-6 click Theater page Button
		theatersPage theater=new theatersPage(driver); 
		theater.getTheaterformat().click();

		//step-7 click terms and Condition Button
		termsAndConditionsPage terms= new termsAndConditionsPage(driver);
		terms.getAcceptterms().click();

		//step-8 click select seat button
		selectSeatsPage selectseat=new selectSeatsPage(driver);
		selectseat.getSelectseat().click();
		driver.quit();


	}

}
