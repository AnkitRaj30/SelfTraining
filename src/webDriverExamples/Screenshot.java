package webDriverExamples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Screenshot {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\Eclipse\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		try {
		driver.navigate().to("http://183.82.125.5/nareshit/index.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Actions ac =  new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		driver.findElement(By.linkText("Add Employee123")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Logout")).click();
		}
		catch(Exception e) {
			File f1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1,new File("g:\\TestResult.png"));
		}
		driver.quit();
	}
}
