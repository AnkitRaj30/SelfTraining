package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Movie2 {
public static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://adactinhotelapp.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("Ankit307");
	driver.findElement(By.name("password")).sendKeys("X2GQSM");
	Thread.sleep(2000);
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("location")).sendKeys("London");
    Thread.sleep(2000);
	driver.findElement(By.name("hotels")).sendKeys("Hotel Sunshine");
    Thread.sleep(2000);
	driver.findElement(By.name("room_type")).sendKeys("Double");
    Thread.sleep(2000);
	driver.findElement(By.name("room_nos")).sendKeys("2 - Two");    
    Thread.sleep(2000);
    driver.findElement(By.name("datepick_in")).sendKeys("27/08/2021");
    Thread.sleep(2000);
	driver.findElement(By.name("datepick_out")).sendKeys("29/08/2021");
    Thread.sleep(2000);
    driver.findElement(By.name("adult_room")).sendKeys("2 - Two");
    Thread.sleep(2000);
    driver.findElement(By.name("child_room")).sendKeys("0 - None");
    Thread.sleep(4000);
    driver.findElement(By.name("Submit")).click();
    Thread.sleep(2000);
    driver.findElement(By.name("radiobutton_0")).click();
    Thread.sleep(4000);
    //driver.findElement(By.xpath("//input[@value='Add']")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.name("txtEmpLastName")).sendKeys("Rana");
	//.findElement(By.name("txtEmpFirstName")).sendKeys("Amit");
	//driver.findElement(By.id("btnEdit")).click();
    //driver.findElement(By.linkText("Logout"));

	
	driver.close();
	
}
}
