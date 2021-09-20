package webDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mgmail {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/search?q=gmail&oq=&aqs=chrome.0.69i59i450l8.580333835j0j7&sourceid=chrome&ie=UTF-8");
		driver.findElement(By.className("srp")).sendKeys(Keys.TAB);
		driver.findElement(By.className("srp")).sendKeys(Keys.TAB);
		driver.findElement(By.className("srp")).sendKeys(Keys.TAB);
		driver.findElement(By.className("srp")).sendKeys(Keys.TAB);
		driver.findElement(By.className("srp")).sendKeys(Keys.TAB);
		driver.findElement(By.className("srp")).sendKeys(Keys.TAB);
		driver.findElement(By.className("srp")).sendKeys(Keys.TAB);
		driver.findElement(By.className("srp")).sendKeys(Keys.TAB);
		driver.findElement(By.className("srp")).sendKeys(Keys.TAB);
		driver.findElement(By.className("srp")).sendKeys(Keys.TAB);
		driver.findElement(By.className("srp")).sendKeys(Keys.TAB);
		/*driver.findElement(By.className("srp")).sendKeys(Keys.TAB);
		driver.findElement(By.className("srp")).sendKeys(Keys.TAB);
		driver.findElement(By.className("srp")).sendKeys(Keys.TAB);
		driver.findElement(By.className("srp")).sendKeys(Keys.TAB);
		driver.findElement(By.className("srp")).sendKeys(Keys.TAB);
		driver.findElement(By.className("srp")).sendKeys(Keys.TAB);
		driver.findElement(By.className("srp")).sendKeys(Keys.TAB);*/
		driver.findElement(By.className("LC20lb DKV0Md")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.className("VmOpGe")).sendKeys(Keys.TAB);
		driver.findElement(By.className("VmOpGe")).sendKeys(Keys.TAB);
		driver.findElement(By.className("VmOpGe")).sendKeys(Keys.ENTER);
	}

}
