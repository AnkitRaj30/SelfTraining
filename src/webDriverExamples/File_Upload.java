package webDriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class File_Upload {
@Test //public static void main(String args[])
public void File_Upload() throws Exception {
	System.setProperty("webdriver.gecko.driver","D:\\\\Eclipse\\\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	System.out.println("Firefox OPen");
	driver.navigate().to("http://183.82.125.5/nareshit/login.php");
	System.out.println("URl Open");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	WebDriverWait wait = new WebDriverWait(driver,5000);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
	driver.findElement(By.name("Submit")).click();
   System.out.println("Expilct Wait completed");
   System.out.println("Login");
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	driver.findElement(By.linkText("Add Employee")).click();
	System.out.println("Mouseover completed");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	System.out.println("implict wait completed");
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.name("txtEmpLastName")).sendKeys("aki");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("ika");
	System.out.println("Frame completed");
	//upload a file
	WebElement FileInput = driver.findElement(By.id("photofile"));
	FileInput.sendKeys("C:\\Users\\A1\\Downloads\\TwjPDJ.jpg");
	System.out.println("File upload sucessfully");
	Thread.sleep(3000);
	driver.findElement(By.id("btnEdit")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("logout completed");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.close();
	System.out.println("driver closed");
	
	
	
	
}
}
