package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class KB_RB {
 public static void main(String args[]) throws Exception {
	 System.setProperty("webdriver.gecko.driver","D:\\Eclipse\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.navigate().to("http://183.82.125.5/nareshit/login.php");
	 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	 driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	 Thread.sleep(3000);
	 //click :  Keyboard 1 TAB  2 ENTER
	 Robot rc = new Robot();
	 rc.keyPress(KeyEvent.VK_TAB);
	 rc.keyRelease(KeyEvent.VK_TAB);
	 System.out.println("TAB");
	 Thread.sleep(3000);
	 rc.keyPress(KeyEvent.VK_ENTER);
	 rc.keyRelease(KeyEvent.VK_ENTER);
	 System.out.println("Enter");
	 Thread.sleep(3000);
	 System.out.println("Login completed");
	 driver.findElement(By.linkText("Logout")).click();
	 Thread.sleep(3000);
	 driver.close();
	 
 }
}
