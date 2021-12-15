package test_maven.test_web;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;



	public class FirefoxTest {



	public static void main(String[] args) {
	// TODO Auto-generated method stub



	//Setting system properties of FirefoxDriver
	System.setProperty("webdriver.gecko.driver", "C:\\Software\\Webdrive\\Firefox\\geckodriver.exe");



	//Creating an object of FirefoxDriver
	WebDriver driver = new FirefoxDriver();
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
	
