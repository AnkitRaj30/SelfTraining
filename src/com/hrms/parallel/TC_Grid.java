package com.hrms.parallel;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TC_Grid {
	@Test
	public void TC002() throws Exception {
		//public static void main(String arg[]) throws Exception {
			System.setProperty("webdriver.gecko.driver","D:\\Eclipse\\geckodriver.exe");
			DesiredCapabilities caps = DesiredCapabilities.firefox();
			//FirefoxOptions ff = new FIREFOX_OPTIONS();
			//caps.setVersion("20");
			caps.setPlatform(Platform.WINDOWS);
			URL urlHub = null;
			urlHub = new URL("https://localhost:5556/wd/hub");
			RemoteWebDriver driver = new RemoteWebDriver(urlHub , caps);
			driver.navigate().to("http://183.82.125.5/nareshit/login.php");
			Thread.sleep(3000);
			System.out.println("Application open");
			if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
				System.out.println("Title Matched");
			}
			else
			{
				System.out.println("Title is not matched"); 
				System.out.println("Title is " +driver.getTitle());
			}
			
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
			Thread.sleep(3000);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(5000);
			System.out.println("Application Login"); 
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("Application Logout");
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
			Thread.sleep(3000);
			driver.findElement(By.name("clear")).click();
			Thread.sleep(5000);
			driver.close();
		}	

	
}
