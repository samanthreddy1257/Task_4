package test_maven.test_web;



	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

	public class EdgeTest {



		public static void main(String[] args) {
		// TODO Auto-generated method stub



		//Setting system properties of EdgeDriver
		System.setProperty("webdriver.edge.driver", "C:\\Software\\Webdrive\\Edge\\msedgedriver.exe");



		//Creating an object of EdgeDriver
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();



		//Deleting all the cookies
		driver.manage().deleteAllCookies();



		//Specifiying pageLoadTimeout and Implicit wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



		//launching the specified URL
		driver.get("https://www.rsystems.com/");



		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Home - R Systems";
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		//closing the driver
		driver.quit();
		}
		}