package scripts;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generic_library.BaseClass;
import pom.homePage;
import pom.filtersPage;
import pom.genresTypePage;
import pom.regionWiseListPage;
import pom.selectSeatsPage;
import pom.termsAndConditionsPage;

/***
 * 
 * @author Sharon Jasphin
 *
 */
@Listeners(generic_library.ITestListeners.class)
public class TC_03Test extends BaseClass{

	@Test
	public void selectgenres() {

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

		//step-3 click Action Button
		genresTypePage types=new genresTypePage(driver);
		types.getGenres().click();
		types.getAction().click();
		
		//step-4 click particiular movie button
		filtersPage fp=new filtersPage(driver);
		fp.getBrowseBycinemas().click();
		
		//step-5 click foe Theater button
		regionWiseListPage list= new regionWiseListPage(driver);
		list.getTheater2().click();
		
		//step-6 click for Movie
		regionWiseListPage lists= new regionWiseListPage(driver);
		lists.getSuryavanshi().click();
		
		//step-7 click for terms button
		termsAndConditionsPage terms= new termsAndConditionsPage(driver);
		terms.getAcceptterms().click();
		
		//step-8 click for seat button
		selectSeatsPage ss=new selectSeatsPage(driver);
		ss.getSelectseat().click();
		driver.quit();
	}
}
