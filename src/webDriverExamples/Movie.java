package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;  
import org.openqa.selenium.interactions.Actions;
class Movie {
		public static void main(String arg[]) throws Exception {
			System.setProperty("webdriver.gecko.driver","D:\\Internship project 2020\\Software Testing (Selenium)\\GeckoDriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
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
			/*Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Add Employee")).click();
			Thread.sleep(4000);*/
			//frame concept
			driver.switchTo().frame("rightMenu");
			driver.findElement(By.xpath("//input[@value='Add']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='txtEmpLastName']")).sendKeys("Rana");
			driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("Amit");
			Thread.sleep(3000);
			driver.findElement(By.id("btnEdit")).click();
			Thread.sleep(2000);
			System.out.println("New Employee Added");
			driver.switchTo().defaultContent();
			//System.out.println("Mouseover completed");
			Thread.sleep(2000);
		    driver.findElement(By.linkText("Logout")).click();
		    Thread.sleep(3000);

			/*driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
			Thread.sleep(3000);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(5000);
			driver.switchTo().frame("rightMenu");
			driver.findElement(By.xpath("//*[@id=\"loc_code\"]")).sendKeys("Emp. Last Name");
			driver.findElement(By.name("loc_name")).sendKeys("Rana");
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			driver.findElement(By.className("chkLocID[]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Delete']")).click();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			driver.findElement(By.linkText("Logout")).click();*/
		    System.out.println("Logout Completed");
		    driver.close();
		    
		}
}
