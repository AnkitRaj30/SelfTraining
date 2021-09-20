package webDriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSE {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\\\Eclipse\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.125.5/nareshit/login.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.manage().window().fullscreen();
		//Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		//JSE is using cilck on login btn
		WebElement loginbtn = driver.findElement(By.name("Submit"));
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[1].click();",loginbtn);
		Thread.sleep(4000);
		System.out.println("Login is completed");
		//JSE is using cilck on logout btn
		WebElement logout = driver.findElement(By.linkText("Logout"));
		JavascriptExecutor executor1 =(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0]",logout);
		System.out.println("Logout Completed");
	    Thread.sleep(2500);
	    driver.close();
		
		
		
		
	}
 
}
