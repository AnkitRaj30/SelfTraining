package webDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Exp_DragDrop {
@Test //public static void main(String args[]) 
public void Exp_DragDrop() throws Exception {
	System.setProperty("webdriver.gecko.driver","D:\\Eclipse\\geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.navigate().to("https://jqueryui.com/");
	assertEquals("jQuery UI",driver.getTitle());
	System.out.println("Tital Matched");
	driver.findElement(By.linkText("Droppable")).click();
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	Actions ac = new Actions(driver);
	ac.dragAndDrop(driver.findElement(By.id("draggable")),
			       driver.findElement(By.id("droppable"))).perform();
	System.out.println("Drag&Drop Completed");
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	driver.close();
}
}
