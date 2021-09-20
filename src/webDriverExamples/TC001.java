package webDriverExamples;
//To get access for webdriver classes & methods
import org.openqa.selenium.WebDriver;
//To get access for firefox browser
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//To get access for objInd: methods
import org.openqa.selenium.By;

public class TC001 {
	public static void main(String args[]) throws Exception {
		//Test Case Steps
	//System.setProperty("webdriver.gecko.driver","D:\\Internship project 2020\\Software Testing (Selenium)\\GeckoDriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	//WebDriver driver = new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver","D:\\Internship project 2020\\Software Testing (Selenium)\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.125.5/nareshit/login.php");
	//driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	//driver.navigate().to("http://www.google.com");
	Thread.sleep(50000); //java: wait statement
	driver.close();

	}
	
}
