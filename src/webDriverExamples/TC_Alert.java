package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class TC_Alert {
           public static void main(String arg[]) throws Exception {
			System.setProperty("webdriver.gecko.driver", "D:\\Eclipse\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.navigate().to("http://183.82.125.5/nareshit/login.php");
			System.out.println(driver.getTitle());
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit ");
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(3000);
			//Alert
			Alert al = driver.switchTo().alert();
			System.out.println(al.getText());
			al.accept();
			Thread.sleep(3000);
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
			driver.findElement(By.name("Submit")).click();
			System.out.println("Login Completed");
			Thread.sleep(3000);
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Logout completed");
			Thread.sleep(3000);
			driver.close();
			
           }
}
