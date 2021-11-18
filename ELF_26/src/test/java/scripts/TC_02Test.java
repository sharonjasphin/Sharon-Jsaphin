package scripts;
import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generic_library.BaseClass;
import pom.homePage;
import pom.filtersPage;
import pom.regionWiseListPage;
import pom.selectSeatsPage;
import pom.termsAndConditionsPage;

/***
 * 
 * @author Sharon Jasphin
 *
 */
@Listeners(generic_library.ITestListeners.class)
public class TC_02Test extends BaseClass{

	@Test
	public void browseByCinemas() throws InterruptedException {

		//Precondition
		String url = "https://in.bookmyshow.com/explore/home/bengaluru";
		String homepageTitle = "Movie Tickets, Plays, Sports, Events & Cinemas near Bengaluru - BookMyShow";

		//Step -1 Validate URL
		String currentUrl = driver.getCurrentUrl();
		assertEquals(url, currentUrl, "URL is not entered properly");
		Reporter.log(currentUrl);

		//Step-2 Validate Homepage is displayed or not
		String actualhomepageTitle = driver.getTitle();
		assertEquals(actualhomepageTitle, homepageTitle , "HomePage is not displayed");
		homePage hp=new  homePage(driver);
		hp.getPopup().click();
		//hp.getLocationbutton().click();
		hp.getMoviesButton().click();

		//step-3 click BrowseBycinema Button
		filtersPage fp=new filtersPage(driver);
		fp.getBrowseBycinemas().click();
		Thread.sleep(3000);

		//step-4 click RegionWise Page Button
		regionWiseListPage list= new regionWiseListPage(driver);
		list.getTheater2().click();
		Thread.sleep(3000);
		regionWiseListPage lists= new regionWiseListPage(driver);
		lists.getSuryavanshi().click();

		//step-5 click Terms and Condtition Button
		termsAndConditionsPage terms= new termsAndConditionsPage(driver);
		terms.getAcceptterms().click();

		//step-6 click Selectseats Button
		selectSeatsPage ss=new selectSeatsPage(driver);
		ss.getSelectseat().click();
		driver.quit();

	}

}
