package webDriverExamples;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_WaitStmt {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\Eclipse\\geckodriver.exe");
		WebDriver driver = new  FirefoxDriver();
		driver.navigate().to("http://183.82.125.5/nareshit/login.php");
		
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		//Cond : Wait until Login btn need to be loaded : Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver,5000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
		driver.findElement(By.name("Submit")).click();
		//Wait until page nees to be loaded : implicit wait
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		System.out.println("Login Completed");
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
