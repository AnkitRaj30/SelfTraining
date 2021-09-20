package webDriverExamples;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exp_Windhand {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\Eclipse\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("file:///D:/Internship%20project%202020/Software%20Testing%20(Selenium)/HtmlFiles/multiplewindows.html");
	driver.findElement(By.id("btn1")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("btn2")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("btn3")).click();
	Thread.sleep(3000);
	ArrayList<String> windinfo = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(windinfo.get(0));
	System.out.println();
	driver.close();	
	Thread.sleep(3000);
	driver.quit(); 
	}

}
