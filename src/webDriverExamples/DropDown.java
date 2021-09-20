package webDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\Eclipse\\geckodriver.exe");
		WebDriver driver = new  FirefoxDriver();
		driver.navigate().to("http://183.82.125.5/nareshit/login.php");
		
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		Select st = new Select(driver.findElement(By.name("loc_code")));
		//st.selectByIndex(1);
		st.selectByVisibleText("Emp. ID");
		//st.selectByValue(1);
		Thread.sleep(3000);
		driver.findElement(By.name("loc_name")).sendKeys("0667");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("allCheck")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
