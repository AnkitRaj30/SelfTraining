package webDriverExamples;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Whole_tc {
@Test //public static void main(String args[])
public void Whole_tc() throws Exception {
 System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.navigate().to("http://183.82.125.5/nareshit/login.php");
 System.out.println("Application open");
 //Verify
 if(driver.getTitle().equals("hmn")) {
	 System.out.println("Tital is matched");
 }
 else {
	 System.out.println("tital is nt mtch");
 }
 System.out.println(driver.getTitle());
 System.out.println("Verify Completed");
 Thread.sleep(3000);
 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
 driver.findElement(By.name("Submit")).sendKeys(Keys.ENTER);
 System.out.println("Keyboard WD Completed");
 Thread.sleep(3000);
 //Alert 
 Alert a = driver.switchTo().alert();
 System.out.println(a.getText());
 a.accept();
 System.out.println("Alert Completed");
 Thread.sleep(3000);
 driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
 Thread.sleep(2000);
 //Keyboard 1 JAVA 
 Robot r = new Robot();
 r.keyPress(KeyEvent.VK_ENTER);
 r.keyRelease(KeyEvent.VK_ENTER);
 System.out.println("Java Keyboard Completed");
 //driver.findElement(By.name("Submit")).sendKeys(Keys.ENTER);
 Thread.sleep(2000);
 System.out.println("Application Login");
 //Mouseover
Actions ac = new Actions(driver);
ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
Thread.sleep(3000);
driver.findElement(By.linkText("Add Employee")).click();
System.out.println("Add Employee Page Open");
System.out.println("Mouseover Completed");
Thread.sleep(2000);
//frame
driver.switchTo().frame("rightMenu");
driver.findElement(By.name("txtEmpLastName")).sendKeys("AN");
driver.findElement(By.name("txtEmpFirstName")).sendKeys("NA");
Thread.sleep(3000);

driver.switchTo().defaultContent();
System.out.println("Frame Completed");
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout Completed");

Thread.sleep(3000);
driver.close();
System.out.println("Application Closed");
}
}
