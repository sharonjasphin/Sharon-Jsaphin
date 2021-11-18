package generic_library;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
/***
 * 
 * @author Sharon Jasphin
 *
 */

public class BaseClass {

	public static WebDriver driver;

	@Parameters("browser")
	@BeforeClass(alwaysRun=true)

	//Launching Browser
	public void bc(@Optional("chrome") String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
			driver=new ChromeDriver();
		} else  {
			System.setProperty("webdriver.gecko.driver","./src/main/resources/drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
	}
	//Entering the url and  providing the ImplicitWait, Maximizing  Screen 
	@BeforeMethod
	public void Enteringtheurl() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
	}

	@AfterMethod
	public  void aftermethod() {

	}
	//CLosing the Browser
	@AfterClass
	public void CLosingtheBrowser() {
		driver.quit();
	}

}


