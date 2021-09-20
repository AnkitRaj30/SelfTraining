package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Login_Logout {
	public static void main(String arg[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Internship project 2020\\Software Testing (Selenium)\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.125.5/nareshit/login.php");
		Thread.sleep(3000);
		System.out.println("Application open");
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title Matched");
		}
		else
		{
			System.out.println("Title is not matched");
			System.out.println("Title is " +driver.getTitle());
		}
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		System.out.println("Application Login");
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		System.out.println("Application Logout");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("clear")).click();
		Thread.sleep(5000);
		driver.close();
	}	

}