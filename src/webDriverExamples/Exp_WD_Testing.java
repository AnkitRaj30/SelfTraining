package webDriverExamples;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Exp_WD_Testing {
	WebDriver driver;
	@BeforeMethod
	public void startUp() {
		System.setProperty("webdriver.chrome.driver","D:\\Internship project 2020\\Software Testing (Selenium)\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();	
		System.out.println("Applicatin Opend");
		Reporter.log("App Opened");
		}
	@AfterMethod
	public void tearDown() {
		driver.close();
		System.out.println("Application closed");
		Reporter.log("App closed");
		
	}
	@Test
	public void tc001() throws Exception {
		FileInputStream file = new FileInputStream("D:\\Internship project 2020\\Software Testing (Selenium)\\Excel File\\OneDrive-2021-09-04\\ReadExcel1.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet sc = wb.getSheet(0);
		String username = sc.getCell(1,4).getContents();
		String password = sc.getCell(2,4).getContents();
		Reporter.log(username);
		Reporter.log(password);
		driver.navigate().to("http://183.82.125.5/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Reporter.log("login completed");
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
	}
	@Test
	public void tc002() throws Exception {
		driver.navigate().to("http://183.82.125.5/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.findElement(By.name("txtEmpLastName")).sendKeys("nareshit");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("nareshit");
		driver.switchTo().defaultContent();
		System.out.println("add emp");
		Reporter.log("Add Emp");
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		
	}
	
	
	

}
